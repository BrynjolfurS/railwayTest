package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;

import java.util.List;

public interface ThreadRepository {
    public Thread save(Thread thread);
    public void delete(Thread thread);
    public List<Thread> findAll();
    public List<Thread> findThreadsBySport(String sportName);
}
