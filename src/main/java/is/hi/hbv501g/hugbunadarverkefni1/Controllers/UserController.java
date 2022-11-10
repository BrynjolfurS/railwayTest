package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;
import is.hi.hbv501g.hugbunadarverkefni1.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Setup/test to create a user with admin priviliges
    @RequestMapping(value = "/createadmin", method = RequestMethod.GET)
    public String createAdmin() {
        userService.createAdmin();
        return "redirect:/home";
    }

    // Page for users with admin priviliges
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminGet(Model model, HttpSession session) {
        return "admin";
    }

    @RequestMapping(value = "/admin/getallusers")
    public String adminFindAllUsers(Model model) {
        model.addAttribute("userList", userService.findAll());
        return "admin";
    }

    @RequestMapping(value = "admin/grantadmin/{id}", method = RequestMethod.GET)
    public String grantAdminPriviliges(@PathVariable("id") long id, Model model) {
        User userToElevate = userService.findByID(id);
        userToElevate.setIsAdmin(true);
        userService.save(userToElevate);
        return "redirect:/admin";
    }

    @RequestMapping(value="/signUp", method= RequestMethod.POST)
    public String signupPOST(User user, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "redirect:/signUp";
        }
        User exists = userService.findByUsername(user.getUsername());
        if(exists == null) {
            userService.save(user);
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String goToSignUp(Model model) {
        model.addAttribute("user", new User());
        return "signUp";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String loginPOST(User user, BindingResult result, Model model, HttpSession session) {
        if(result.hasErrors()) {
            return "login";
        }
        User exists = userService.login(user);
        if (exists != null) {
            session.setAttribute("LoggedInUser", exists);
            model.addAttribute("LoggedInUser", exists);
            System.out.println(exists.getIsAdmin());
            return "redirect:/";
        }
        return "redirect:/home";
    }

    @RequestMapping(value="/logout", method = RequestMethod.POST)
    public String logOut(HttpSession session) {
        session.removeAttribute("LoggedInUser");
        return "redirect:/home";
    }

    @RequestMapping(value="/loggedin", method = RequestMethod.GET)
    public String loggedinGET(HttpSession session, Model model) {
        User sessionUser = (User) session.getAttribute("LoggedInUser");
        if (sessionUser != null) {
            model.addAttribute("LoggedInUser", sessionUser);
            return "loggedInUser";
        }
        return "redirect:/";
    }
}
