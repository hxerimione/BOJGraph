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
        //exist 여부 확인하고 없는 경우에만 저장
        //update는 어떻게 해아할지 걱정..
        if (!(userRepository.existsByName(username))) {
            Long[] level = getApi.getUserSolved(username)[0];
            Long[] exp = getApi.getUserSolved(username)[1];
            UserEntity user = UserEntity
                    .builder()
                    .name(username)
                    .exp(exp)
                    .level(level)
                    .build();
            userRepository.save(user);
            System.out.println("save success");
        }
        return ;
    }

    public UserEntity findByName(String name){
        return userRepository.findByName(name);
    }
    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void clearStore(){
        userRepository.deleteAll();
    }



}
