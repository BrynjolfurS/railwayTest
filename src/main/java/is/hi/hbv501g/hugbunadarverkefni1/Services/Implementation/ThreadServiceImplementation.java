package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Repositories.ThreadRepository;
import is.hi.hbv501g.hugbunadarverkefni1.Services.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;


@Service
public class ThreadServiceImplementation implements ThreadService {
    private ThreadRepository threadRepository;

    /*@Autowired
    public ThreadServiceImplementation(ThreadRepository threadRepository) {
        this.threadRepository = threadRepository;

    }*/


    @Override
    public void addComment(String comment) {

    }

    @Override
    public Thread save(Thread thread){

        return null;
    }



    @Override
    public List<Thread> findAllThreadsBySport(String sport) {
        //String user, boolean isPinned, List<Comment> comments, String header, String body
        List<Thread> threads = new ArrayList<Thread>();
        List<Comment> a = new ArrayList<Comment>();
        threads.add(new Thread(1,"mr stuff1",false,a,sport+" thread1",sport+sport+sport));
        threads.add(new Thread(2,"mr stuff2",false,a,sport+" thread2",sport+sport+sport+sport));
        threads.add(new Thread(3,"mr stuff3",false,a,sport+" thread3",sport+sport+sport+sport+sport));
        return threads;
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

        return null;
    }


}
