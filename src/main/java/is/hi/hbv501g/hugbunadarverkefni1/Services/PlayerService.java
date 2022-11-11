package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Player;

import java.util.List;

public interface PlayerService {
    public List<Player> findAllPlayers();
    public List<Player> findAllPlayersBySport(String sport);
    public List<Player> findTopPlayersBySport(String sport);
    public Player save(Player player);
}
