package BOJGraph.core.grade;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import BOJGraph.core.api.*;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //저장
    public void saveUser(String username){
        Long[] level = getApi.getUserSolved(username)[0];
        Long[] exp = getApi.getUserSolved(username)[1];
        UserEntity user = UserEntity
                .builder()
                .name(username)
                .exp(exp)
                .level(level)
                .build();
        //ObjectId id = user.getId();
        userRepository.save(user);
        System.out.println("save success");

        return ;
    }

    public UserEntity findByName(String name){
        return userRepository.findByName(name);
    }
//    public Long[] findLevelByName(String username){
//        System.out.println("he123");
//        return userRepository.findLevelByName(username);
//    }
//
//    public Long[] findExpByName(String username){
//
//        return userRepository.findExpByName(username);
//    }




}
