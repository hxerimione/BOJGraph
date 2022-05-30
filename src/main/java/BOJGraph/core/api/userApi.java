package BOJGraph.core.api;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.parser.JSONParser; // JSON객체 파싱

import java.io.IOException;



public class userApi {
    JSONParser parser = new JSONParser();
    public String getJson(String url) {
        HttpClient httpClient = null;
        //CloseableHttpClient httpClient = null;
        httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Content-Type","application/json");
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //CloseableHttpResponse response = httpClient.execute(httpGet);
        System.out.println("::CloseableHttpResponse ::");

        if(response.getStatusLine().getStatusCode()==200){
            System.out.println("connect success");
            System.out.println(response.getStatusLine().getStatusCode());
            ResponseHandler<String> handler = new BasicResponseHandler();
            String body = null;
            try {
                body = handler.handleResponse(response);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return body;
        }
        else{
            System.out.println("connect fail");
            System.out.println(response.getStatusLine().getStatusCode());
            return "";
        }
    }
    public String getJson2(String url) throws IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.setHeader("Content-Type", "application/json");

        CloseableHttpResponse response = client.execute(request);
        if(response.getStatusLine().getStatusCode()==200){
            System.out.println("connect success");
            System.out.println(response.getStatusLine().getStatusCode());
            ResponseHandler<String> handler = new BasicResponseHandler();
            String body = handler.handleResponse(response);
            return body;
        }
        else{
            System.out.println("connect fail");
            System.out.println(response.getStatusLine().getStatusCode());
            return "fail";
        }
    }

}