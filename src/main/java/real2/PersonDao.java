package real2;

import java.util.HashMap;
import java.util.Map;

import real2.Person;

public enum PersonDao {
    instance;

    private Map<String, Person> contentProvider = new HashMap<>();

    public Map<String, Person> getModel(){
        return contentProvider;
    }

}
