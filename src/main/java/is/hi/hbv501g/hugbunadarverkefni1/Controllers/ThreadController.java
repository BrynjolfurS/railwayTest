package is.hi.hbv501g.hugbunadarverkefni1.Controllers;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThreadController {


    @RequestMapping(value = "/home/{sport}/thread/{id}", method = RequestMethod.POST)
    public String addComment(Comment comment,Model model) {
        //tekur inn comment og addar því við thred
        return "redirect:/home/{sport}/thread/{id}";
    }


    @RequestMapping(value = "/home/{sport}/thred/{id}/comment/stuff", method = RequestMethod.POST)
    public String deleteComment(Model model) {
        //duno
        return "redirect:/home/{sport}/thred/{id}";
    }

    @RequestMapping(value = "/home/{sport}/thred/{id}/delete", method = RequestMethod.POST)
    public String deleteThread(Model model) {
        //tekur inn thred id og deletes thred svo redirectum við á sport
        return "redirect:/home/{sport}";
    }

    @RequestMapping(value = "/home/{sport}/createThread", method = RequestMethod.POST)
    public String addThread(Model model) {
        //tekur inn thread og sendir hann í repository svo redirectum við til thread með id
        return "redirect:/home/{sport}/thread/{id}";
    }

}
