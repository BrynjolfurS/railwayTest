package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;

import java.util.List;

public interface ThreadService {
    public void addComment(Comment comment, Thread thread);
    public Thread save(Thread thread);
    public List<Thread> findAllThreadsBySport(String Sport);
    public List<Thread> findAllThreads();
    public List<Thread> sortThreads();
    public void delete(Thread thread);
    public void deleteAll();
    public void deleteComment(Comment comment);
    public Thread findThreadById(Long id);
}
