package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model) {
        // loggin og sendir á home
        return "redirect:/";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String signin(Model model) {
        // signin og sendir á login
        return "redirect:/login";
    }
}
