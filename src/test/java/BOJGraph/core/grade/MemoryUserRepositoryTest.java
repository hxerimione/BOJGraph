package BOJGraph.core.grade;

import BOJGraph.core.api.getApi;
import com.jayway.jsonpath.Criteria;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.management.Query;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
@Rollback(value = false)
class MemoryUserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;
    @Test
    public void insertTest(){
        Long[] level = {1L,0L};
        Long[] exp = {0L,1L};
        UserEntity user = UserEntity
                .builder()
                .name("janghaerim")
                .level(level)
                .exp(exp).build();

        userRepository.save(user);
        UserEntity findUser = userRepository.findById(user.getId()).get();

        //Query query = new Query(Criteria.where("name").is("navi"));

        //PetEntity findPet = mongoTemplate.findOne(query, PetEntity.class, "TestCollection");

        assertThat(user.getId()).isEqualTo(findUser.getId());
        assertThat(user.getName()).isEqualTo(findUser.getName());
        assertThat(user.getExp()).isEqualTo(findUser.getExp());
    }
    @Test
    public void saveTest(){
        String username = "hxerimione";
        Long[] level = getApi.getUserSolved(username)[0];
        Long[] exp = getApi.getUserSolved(username)[1];
        UserEntity user = UserEntity
                .builder()
                .name(username)
                .exp(exp)
                .level(level)
                .build();
        userRepository.save(user);
        Long[] findLevel = userService.findLevelByName(username);
        System.out.println("happy" + findLevel[2]);
        assertThat(level[0]).isEqualTo(findLevel[0]);
    }





//    @Test
//    public void save(){
//        User user = new User();
//        user.setName("hyerim");
//
//        repository.save(user);
//
//        String name = user.getName();
//        Assertions.assertThat(repository.fineName()).isEqualTo("hyerim");
//    }
//    @Test
//    public void findName(){
//        User user = new User();
//        user.setName("hyerim");
//
//        repository.save(user);
//
//        String name = user.getName();
//        Assertions.assertThat(repository.fineName()).isEqualTo(name);
//    }
//
//    @Test
//    public void findLevel(){
//        User user = new User();
//        user.setName("hyerim");
//        Long[] arr = {1L,2L,3L,4L,1L,2L,3L,3L,4L,3L,2L,3L,2L,3L,2L,5L,1L,4L,6L,5L,3L,2L,4L,5l,5L,6L,7L,2L,1L,2L,3L};
//        user.setLevel(arr);
//        repository.save(user);
//        Long[] result = user.getLevel();
//        Assertions.assertThat(repository.findLevel()).isEqualTo(result);
//
//    }

}