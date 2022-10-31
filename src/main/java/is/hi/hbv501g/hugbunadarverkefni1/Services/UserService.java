package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;

import java.util.List;

public interface UserService {

    void logout();
    User findByUsername(String username);
    List<User> findAll();
    User login(User user);
    User save(User user);
}
