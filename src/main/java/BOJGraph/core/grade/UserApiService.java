package BOJGraph.core.grade;

import BOJGraph.core.api.getApi;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
@RequiredArgsConstructor
public class UserApiService {

    private final UserApiRepository userApiRepository;
    public void saveData(String username) {
        Long[] level = getApi.getUserSolved(username)[0];
        Long[] exp = getApi.getUserSolved(username)[1];
        UserEntity user = UserEntity
                .builder()
                .name(username)
                .exp(exp)
                .level(level)
                .build();
        userApiRepository.save(user);
    }
    public Map<String, Map<String,Object>> findData(){
        Map<String, Map<String,Object>> find = userApiRepository.find();
        return find;
    }
}
