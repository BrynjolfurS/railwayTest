package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {

    @RequestMapping("1")
    public String sportPageController() {
        return "";
    }

    @RequestMapping("2")
    public String goToHome(Model model) {

        return "";
    }

    @RequestMapping("3")
    public String goToSport(String sport) {

        return "";
    }

    @RequestMapping("4")
    public String goToAboutSport(Model model) {

        return "";
    }

    @RequestMapping("5")
    public String goToEvents(Model model) {

        return "";
    }

    @RequestMapping("6")
    public String goToClubs(Model model) {

        return "";
    }

    @RequestMapping("7")
    public String goToTopPlayers(Model model) {

        return "";
    }

    @RequestMapping("8")
    public String goToCreateThread(Model model) {

        return "";
    }

    @RequestMapping("9")
    public String goToCreateEvent(Model model) {

        return "";
    }

    @RequestMapping("/login")
    public String goToLogin() {

        return "";
    }
}
