package is.hi.hbv501g.hugbunadarverkefni1.Services;

import java.util.List;

public interface SportService {
    public List<String> findAll();
    public void editEntity(Object object);
    public void createEntity(Object object);
}
