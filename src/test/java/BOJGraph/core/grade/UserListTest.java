package BOJGraph.core.grade;

import org.assertj.core.api.Assertions;
import org.bson.types.ObjectId;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class UserListTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @AfterEach
    public void afterEach(){
        userRepository.deleteAll();
    }
    @Test
    public void listTest(){
        //given
        Long[] level1 = {0L,0L};
        Long[] exp1 = {1L,1L};
        UserEntity user1 = UserEntity
                .builder()
                .name("user1")
                .level(level1)
                .exp(exp1).build();
        userRepository.save(user1);
        Long[] level2 = {2L,2L};
        Long[] exp2 = {3L,3L};
        UserEntity user2 = UserEntity
                .builder()
                .name("user2")
                .level(level2)
                .exp(exp2).build();
        userRepository.save(user2);
        //when
        List<UserEntity> lst = userRepository.findAll();
        List<ObjectId> o = new ArrayList<>();
        for (UserEntity entity:
             lst) {
            o.add(entity.getId());
        }
        Assertions.assertThat(o).contains(user1.getId());
        Assertions.assertThat(o).contains(user2.getId());
    }
}
