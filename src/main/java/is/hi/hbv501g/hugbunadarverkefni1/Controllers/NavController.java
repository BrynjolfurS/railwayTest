package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {

    @RequestMapping("/{sportid}")
    public String sportPageController() {
        return "/sport/{sportid}";
    }
}
