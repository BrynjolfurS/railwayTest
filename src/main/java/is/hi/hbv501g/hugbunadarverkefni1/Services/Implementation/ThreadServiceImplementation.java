package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Club;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Comment;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.Thread;
import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;
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

//--------------------------------------------------------------

    @Override
    public void dev(String sport) {
        List<Comment> a = new ArrayList<Comment>();

        save(new Thread("mr stuff1",sport+" thread1",sport+sport+sport,sport));
    }

    //----------------------------------------


    @Override
    public void addComment(String comment, Thread thread) {
        threadRepository.save(new Comment(null, comment, thread));
    }

    @Override
    public Thread save(Thread thread) {
        return threadRepository.save(thread);
    }

    @Override
    public List<Thread> findAllThreadsBySport(String sport) {
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
    public void deleteAll() {
        threadRepository.deleteAll();
    }

    @Override
    public void deleteComment(Comment comment) {

    }

    @Override
    public Thread findThreadById(Long id) {
        return  threadRepository.findByID(id);
    }

    @Override
    public List<Thread> findAllThreads() {
        return threadRepository.findAll();
    }

    public void PopulateDummyData() {
        threadRepository.deleteAll();
        threadRepository.save(new Thread("user", "Badminton test þráður 1", "body", "badminton"));
        threadRepository.save(new Thread("user", "Pílukast test þráður 1", "body", "pilukast"));
        threadRepository.save(new Thread("user", "Pílukast test þráður 2", "body", "pilukast"));
        threadRepository.save(new Thread("user", "Badminton test þráður 2", "body", "badminton"));
        threadRepository.save(new Thread("user", "Pílukast test þráður 3", "body", "pilukast"));
    }
}
