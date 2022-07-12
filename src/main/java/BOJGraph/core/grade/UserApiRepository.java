package BOJGraph.core.grade;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class UserApiRepository {
    Map<String, Map<String,Object>> Data = new HashMap<>();
    public void save(UserEntity user){
        Map<String, Object> expLevel = new HashMap<>();
        expLevel.put("exp",user.getExp());
        expLevel.put("level",user.getLevel());
        Data.put(user.getName(),expLevel);
    }

    public Map<String, Map<String,Object>> find(){
        return Data;
    }

}
