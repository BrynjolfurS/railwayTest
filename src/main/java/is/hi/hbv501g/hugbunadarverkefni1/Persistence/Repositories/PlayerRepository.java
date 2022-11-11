package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    public Player save(Player player);
    public void delete(Player player);
    public Player findByID(Long id);
    public List<Player> findAll();
    public List<Player> findBySport(String sport);
}