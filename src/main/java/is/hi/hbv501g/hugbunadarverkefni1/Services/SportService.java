package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Club;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Event;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Player;

import java.util.List;

public interface SportService {

    void dev(String sport);
    public List<String> findAllSports();
    List<Event> findAllEventsBySport(String sport);
    Club saveClub(Club club);
    void  deletClubById(long id);
    Event saveEvent(Event event);
    void  deletEventById(long id);
    Player savePlayer(Player player);
    void  deletPlayerById(long id);
    List<Player> findAllPlayersBySport(String sport);



    List<Club> findAllClubsBySport(String sport);


}
