package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import is.hi.hbv501g.hugbunadarverkefni1.Services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ThreadServiceImplementation implements ThreadService {

    private List<Thread> threads = new ArrayList<>();
    private int id_counter = 0;

    @Autowired
    public ThreadServiceImplementation() {

    }


    @Override
    public void save(String comment) {

    }

    @Override
    public void save(Thread thread) {

    }

    @Override
    public List<Thread> findThreadsBySport(String sportName) {
        return null;
    }

    @Override
    public List<Thread> sortThreads() {
        return null;
    }

    @Override
    public void delete(Thread thread) {

    }

    @Override
    public void deleteComment(Comment comment) {

    }
}
