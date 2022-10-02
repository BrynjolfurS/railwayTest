package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {

    @RequestMapping()
    public String sportPageController() {
        return "";
    }

    @RequestMapping()
    public String goToHome(Model model) {

        return "";
    }

    @RequestMapping()
    public String goToSport(String sport) {

        return "";
    }

    @RequestMapping()
    public String goToAboutSport(Model model) {

        return "";
    }

    @RequestMapping()
    public String goToEvents(Model model) {

        return "";
    }

    @RequestMapping()
    public String goToClubs(Model model) {

        return "";
    }

    @RequestMapping()
    public String goToTopPlayers(Model model) {

        return "";
    }

    @RequestMapping()
    public String goToCreateThread(Model model) {

        return "";
    }

    @RequestMapping()
    public String goToCreateEvent(Model model) {

        return "";
    }

    @RequestMapping("/login")
    public String goToLogin() {

        return "";
    }
}
