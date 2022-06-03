package BOJGraph.core.grade;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    String fineName();
    Long[] findLevel();
    Long[] findExp();
}
