package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SportController {

    @RequestMapping(value = "/home/{sport}/editInformation/edit", method = RequestMethod.POST)
    public String editObject(Model model) {
        //takes in object and saves changes
        return "redirect:/home/{sport}/editInformation";
    }

    @RequestMapping(value = "/home/{sport}/editInformation/save", method = RequestMethod.POST)
    public String saveObject(Model model) {
        //takes in object and saves changes
        return "redirect:/home/{sport}/editInformation";
    }

    @RequestMapping(value = "/home/{sport}/editInformation/delete", method = RequestMethod.POST)
    public String deleteObject(Model model) {
        //takes in object and saves changes
        return "redirect:/home/{sport}/editInformation";
    }
}
