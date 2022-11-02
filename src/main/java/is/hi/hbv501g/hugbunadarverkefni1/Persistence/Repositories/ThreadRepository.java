package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ThreadRepository extends JpaRepository<Thread, Long> {
    public Thread save(Thread thread);
    public void delete(Thread thread);
    public List<Thread> findAll();
    public List<Thread> findThreadsBySport(String sportName);
}
