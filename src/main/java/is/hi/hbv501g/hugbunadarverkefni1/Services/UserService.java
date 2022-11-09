package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByUsername(String username);

    User findByID(long id);

    User save(User user);

    User login(User user);

    void createAdmin();

}
