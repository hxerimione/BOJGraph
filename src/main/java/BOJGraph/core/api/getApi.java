package BOJGraph.core.api;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;


public class getApi {
    static JSONParser parser = new JSONParser();

    static userApi userApi = new userApi();
    public static Long[][] getUserSolved(String userName) {
        Long[][] LNE = new Long[2][31];
        String URL = "https://solved.ac/api/v3/user/problem_stats?handle=" + userName;
        String parseJSON = userApi.getJson(URL);
        try {
            Object object = parser.parse(parseJSON);
            JSONArray jsonArray = (JSONArray) object;
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObj = (JSONObject) jsonArray.get(i);
                LNE[0][i] = (Long) jsonObj.get("solved");
                LNE[1][i] = (Long) jsonObj.get("exp");
                System.out.print(jsonObj.get("solved") + " ");
            }
            //JSONObject jo = (JSONObject) object;
            //System.out.println(jo.get("level"));
            //System.out.println("내가 푼 문제 수 : " + jo.get("solvedCount"));
            //System.out.println("나의 경험치 : " + jo.get("exp"));
        } catch (ParseException e) {
            System.out.println(e);
        }
        return LNE;
    }
    public static Long[] getUserExp(String userName){
        Long[] exp = new Long[31];
        String URL = "https://solved.ac/api/v3/user/problem_stats?handle=" + userName;
        String parseJSON = userApi.getJson(URL);
        try {
            Object object = parser.parse(parseJSON);
            JSONArray jsonArray = (JSONArray) object;
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObj = (JSONObject) jsonArray.get(i);
                exp[i] = (Long)jsonObj.get("exp");
                System.out.print(jsonObj.get("exp") + " ");
            }

        } catch (ParseException e) {
            System.out.println(e);
        }
        return exp;
    }
}
