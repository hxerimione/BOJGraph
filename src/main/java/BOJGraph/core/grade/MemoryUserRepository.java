package BOJGraph.core.grade;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public class MemoryUserRepository implements UserRepository{
    private static User store = new User();


    @Override
    public User save(User user) {
        store=user;
        return store;
    }

    @Override
    public String fineName() {
        return store.getName();
    }


    @Override
    public Long[] findLevel() {
        return store.getLevel();
    }

}
