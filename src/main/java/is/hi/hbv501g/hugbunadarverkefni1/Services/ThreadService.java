package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;

import java.util.List;

public interface ThreadService {
    public void save(String comment);
    public Thread save(Thread thread);
    public List<Thread> findThreadsBySport(String sportName);
    public List<Thread> sortThreads();
    public void delete(Thread thread);
    public void deleteComment(Comment comment);
}
