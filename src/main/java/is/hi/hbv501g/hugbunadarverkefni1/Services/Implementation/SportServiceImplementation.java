package is.hi.hbv501g.hugbunadarverkefni1.Services.Implementation;

import is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities.User;
import is.hi.hbv501g.hugbunadarverkefni1.Services.SportService;

import java.util.List;

public class SportServiceImplementation implements SportService {

    @Override
    public List<String> findAll() {
        return null;
    }

    @Override
    public void editEntity(Object object) { // Spurning hvort þetta virki sem einhvers konar Generic til að edita?
        if(object.getClass().equals(User.class)) {

        }
    }

    @Override
    public void createEntity(Object object) {

    }
}
