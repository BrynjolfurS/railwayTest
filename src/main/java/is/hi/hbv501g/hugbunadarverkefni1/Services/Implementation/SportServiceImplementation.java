package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Club;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Event;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;
import is.hi.hbv501g.hugbunadarverkefni1.Services.SportService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class SportServiceImplementation implements SportService {

    @Override
    public List<String> findAllSports() {
        List<String> sport = new ArrayList<String>();
        sport.add("badminton");
        sport.add("pílukast");
        sport.add("Extreme Ironing");

        return sport;
    }

    @Override
    public List<Event> findAllEventsBySport(String sport) {
        List<Event> events = new ArrayList<Event>();
        events.add(new Event(sport+"---1---     ",sport));
        events.add(new Event(sport+"---2---     ",sport));
        events.add(new Event(sport+"---3---     ",sport));
        return events;
    }

    @Override
    public List<Club> findAllClubsBySport(String sport) {
        List<Club> clubs = new ArrayList<Club>();
        clubs.add(new Club(sport+"---1---     ","https://www.youtube.com/watch?v=dQw4w9WgXcQ",sport+sport+sport+sport));
        clubs.add(new Club(sport+"---2---     ","https://www.youtube.com/watch?v=dQw4w9WgXcQ",sport+sport+sport+sport));
        clubs.add(new Club(sport+"---3---     ","https://www.youtube.com/watch?v=dQw4w9WgXcQ",sport+sport+sport+sport));
        return clubs;
    }



    @Override
    public void editEntity(Object object) { // Spurning hvort þetta virki sem einhvers konar Generic til að edita?
        if(object.getClass().equals(User.class)) {

        }
    }

    @Override
    public void createEntity(Object object) {

    }

}
