package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories.ThreadRepository;
import is.hi.hbv501g.hugbunadarverkefni1.Services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ThreadServiceImplementation implements ThreadService {
    private ThreadRepository threadRepository;

    @Autowired
    public ThreadServiceImplementation(ThreadRepository threadRepository) {
        this.threadRepository = threadRepository;

    }


    @Override
    public void save(String comment) {

    }

    @Override
    public Thread save(Thread thread) {
        return threadRepository.save(thread);
    }

    @Override
    public List<Thread> findThreadsBySport(String sportName) {
        return threadRepository.findThreadsBySport(sportName);

    }

    @Override
    public List<Thread> sortThreads() {
        return null;
    }

    @Override
    public void delete(Thread thread) {
        threadRepository.delete(thread);
    }

    @Override
    public void deleteComment(Comment comment) {

    }
}
