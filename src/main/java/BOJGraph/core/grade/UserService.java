package BOJGraph.core.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import BOJGraph.core.api.*;

public class UserService {


    private final UserRepository userRepository;
    //api가 없다고 나오는지 있는지를 통해 git 아이디 여부 확인하는 기능


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //저장
    public User saveUser(String name){

        User user = new User();
        user.setName(name);
        //name으로 api 통해 level 구하기
        user.setLevel(getApi.getUserApi(name));
        userRepository.save(user);

        return user;
    }
    public Long[] findL(){
        Long[] level = userRepository.findLevel();
        return level;
    }

}
