package is.hi.hbv501g.hugbunadarverkefni1.Services;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;

public interface UserService {

    public User login(String username, String userPass);
    public void logout();
    public User save(String username, String userPass);
}
