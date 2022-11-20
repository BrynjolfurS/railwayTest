package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;


import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Player;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories.PlayerRepository;
import is.hi.hbv501g.hugbunadarverkefni1.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PlayerServiceImplementation implements PlayerService {

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImplementation(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public List<Player> findAllPlayersBySport(String sport) {
        return playerRepository.findBySport(sport);
    }

    @Override
    public List<Player> findTopPlayersBySport(String sport) {
        List<Player> players = playerRepository.findBySport(sport);
        Collections.sort(players);
        Collections.reverse(players);
        List<Player> topPlayers = new ArrayList<>();

        try {
            if (players.size() > 5) {
                for (int i = 0; i < 5; i++) {
                    topPlayers.add(players.get(i));
                }
            }
            else if (players.size() == 0) {
                return null;
            }
            else {
                for (int i = 0; i < players.size(); i++) {
                    topPlayers.add(players.get(i));
                }
            }
            return topPlayers;
        } catch (Exception ex) {
            System.err.println("No players \n" + ex);
            return null;
        }


    }

    @Override
    public Player save(Player player) {
        return playerRepository.save(player);
    }
}
