package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Player;

import java.util.List;

public interface SportRepository {
    public List<Player> getTopPlayers(String sport);
    public List<String> findAllSports();
}
