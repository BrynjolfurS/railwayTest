package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomeController() {
        return "home";
    }

    @RequestMapping("/test")
    public String Test() { return "test"; }

    @RequestMapping("/login")
    public String Login() {return "login";}
}
