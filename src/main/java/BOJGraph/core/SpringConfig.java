package BOJGraph.core;

import BOJGraph.core.grade.MemoryUserRepository;
import BOJGraph.core.grade.UserRepository;
import BOJGraph.core.grade.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public UserService userService(){
        return new UserService(userRepository());
    }

    @Bean
    public UserRepository userRepository(){
        return new MemoryUserRepository();
    }
}
