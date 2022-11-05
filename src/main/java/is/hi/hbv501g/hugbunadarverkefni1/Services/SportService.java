package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Club;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Event;

import java.util.ArrayList;
import java.util.List;

public interface SportService {
    public List<String> findAllSports();
    List<Event> findAllEventsBySport(String sport);
    public void editEntity(Object object);
    public void createEntity(Object object);

    List<Club> findAllClubsBySport(String sport);


}
