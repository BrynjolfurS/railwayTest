package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;
import is.hi.hbv501g.hugbunadarverkefni1.Services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Override
    public User login(String username, String userPass) {
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public User save(String username, String userPass) {
        return null;
    }
}
