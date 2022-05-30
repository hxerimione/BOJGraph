package BOJGraph.core.grade;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryUserRepositoryTest {
    MemoryUserRepository repository = new MemoryUserRepository();

    @Test
    public void save(){
        User user = new User();
        user.setName("hyerim");

        repository.save(user);

        String name = user.getName();
        Assertions.assertThat(repository.fineName()).isEqualTo("hyerim");
    }
    @Test
    public void findName(){
        User user = new User();
        user.setName("hyerim");

        repository.save(user);

        String name = user.getName();
        Assertions.assertThat(repository.fineName()).isEqualTo(name);
    }

    @Test
    public void findLevel(){
        User user = new User();
        user.setName("hyerim");
        int[] arr = {1,2,3,4,1,2,3,3,4,3,2,3,2,3,2,5,1,4,6,5,3,2,4,5,5,6,7,2,1,2,3};
        user.setLevel(arr);
        repository.save(user);
        int[] result = user.getLevel();
        Assertions.assertThat(repository.findLevel()).isEqualTo(result);

    }

}