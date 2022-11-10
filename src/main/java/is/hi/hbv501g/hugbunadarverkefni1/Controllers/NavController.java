package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;
import is.hi.hbv501g.hugbunadarverkefni1.Services.SportService;
import is.hi.hbv501g.hugbunadarverkefni1.Services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NavController {

    private final SportService sportService;
    private final ThreadService threadService;


    @Autowired
    public NavController(SportService sportService, ThreadService threadService){
        this.sportService = sportService;
        this.threadService = threadService;
    }

    //----------------Test stuff----------------------------------------------------
    @RequestMapping(value = "/dev/{sport}", method = RequestMethod.GET)
    public String dev(@PathVariable("sport") String sport, Model model) {
        sportService.dev(sport);
        threadService.dev(sport);
        return "redirect:/home/"+sport;
    }

//-------------------------------------------------



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToRoot() {
        return "redirect:/home";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String goToHome(HttpSession session, Model model, User user) {

        // Hjálparfall sem býr til 5 dummy þræði til að setja á forsíðu
        //threadService.PopulateDummyData();


        List<Thread> threads = threadService.findAllThreads();
        model.addAttribute("threads", threads);
        List<String> sports = sportService.findAllSports();
        model.addAttribute("sports", sports);
        model.addAttribute("user", user);
        return "home";
    }

    @RequestMapping(value = "/home/{sport}", method = RequestMethod.GET)
    public String goToSport(@PathVariable("sport") String sport, Model model) {
        //add threads from {sport} to model
        model.addAttribute("threads", threadService.findAllThreadsBySport(sport));
        model.addAttribute("sport", sport);
        List<String> sports = sportService.findAllSports();
        model.addAttribute("sports", sports);

        return "sport";
    }

    @RequestMapping(value = "/home/{sport}/about", method = RequestMethod.GET)
    public String goToAboutSport(@PathVariable("sport") String sport) {
        //done
        return "about"+sport;
    }

    @RequestMapping(value = "/home/{sport}/events", method = RequestMethod.GET)
    public String goToEvents(@PathVariable("sport") String sport, Model model) {
        model.addAttribute("events", sportService.findAllEventsBySport(sport));
        return "events";
    }

    @RequestMapping(value = "/home/{sport}/clubs", method = RequestMethod.GET)
    public String goToClubs(@PathVariable("sport") String sport, Model model) {
        model.addAttribute("clubs", sportService.findAllClubsBySport(sport));
        return "clubs";
    }

    @RequestMapping(value = "/home/{sport}/players", method = RequestMethod.GET)
    public String goToTopPlayers(Model model) {
        // add players from {sport} to model
        return "players";
    }

    @RequestMapping(value = "/home/{sport}/editInformation", method = RequestMethod.GET)
    public String goToEditInformation(Model model) {
        //duno
        return "editInformation";
    }

    /*
    @RequestMapping(value = "/home/{sport}/createThread", method = RequestMethod.GET)
    public String goToCreateThread(Model model) {
        //done?
        return "createThread";
    }
     */

    @RequestMapping(value = "/home/{sport}/thread/{id}", method = RequestMethod.GET)
    public String goToThread(@PathVariable("id") Long id, Model model) {
        //add thred með {id} i model
        Thread thread = threadService.findThreadById(id);
        model.addAttribute("thread", thread);
        model.addAttribute("sports", sportService.findAllSports());
        model.addAttribute("comments", thread.getComments());

        return "thread";
    }
}
