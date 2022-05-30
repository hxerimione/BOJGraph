package BOJGraph.core.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class getApi {
    public static Long[] getUserApi(String userName) {
        Long[] level = new Long[31];
        String URL = "https://solved.ac/api/v3/user/problem_stats?handle=" + userName;

        JSONParser parser = new JSONParser();

        userApi userApi = new userApi();
        String parseJSON = userApi.getJson(URL);

        try {

            Object object = parser.parse(parseJSON);
            JSONArray jsonArray = (JSONArray) object;

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObj = (JSONObject) jsonArray.get(i);
                level[i] = (Long) jsonObj.get("solved");
                System.out.print(jsonObj.get("solved") + " ");
            }
            //JSONObject jo = (JSONObject) object;
            //System.out.println(jo.get("level"));
            //System.out.println("내가 푼 문제 수 : " + jo.get("solvedCount"));
            //System.out.println("나의 경험치 : " + jo.get("exp"));

        } catch (ParseException e) {
            System.out.println(e);
        }
        return level;
    }
}
