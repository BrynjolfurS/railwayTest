package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;

public interface UserService {


    User findByUsername(String username);

    User save(User user);

    User login(User user);
}
