package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Club;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories.ThreadRepository;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories.UserRepository;
import is.hi.hbv501g.hugbunadarverkefni1.Services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThreadServiceImplementation implements ThreadService {

    private ThreadRepository threadRepository;

    @Autowired
    public ThreadServiceImplementation(ThreadRepository threadRepository) {
        this.threadRepository = threadRepository;
    }


    @Override
    public void addComment(String comment) {

    }

    @Override
    public void save(Thread thread) {
        threadRepository.save(thread);
    }

    @Override
    public List<Thread> findAllThreadsBySport(String sport) {
        //String user, boolean isPinned, List<Comment> comments, String header, String body
        //List<Thread> threads = new ArrayList<Thread>();
        List<Comment> a = new ArrayList<Comment>();
      /*  threads.add(new Thread("mr stuff1",false,a,sport+" thread1",sport+sport+sport,sport));
        threads.add(new Thread("mr stuff2",false,a,sport+" thread2",sport+sport+sport+sport,sport));
        threads.add(new Thread("mr stuff3",false,a,sport+" thread3",sport+sport+sport+sport+sport,sport));
        */
        save(new Thread("mr stuff1",false,a,sport+" thread1",sport+sport+sport,sport));
        return threadRepository.findBySport(sport);
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

    @Override
    public Thread findThreadById(Long id) {
        List<Comment> a = new ArrayList<Comment>();

        return new Thread("mr stuff1",false,a,"thread header5"+" thread1","sædlkfjælsakdjfæls this is the body slifjsælkfkm","sdsd");
    }


}
