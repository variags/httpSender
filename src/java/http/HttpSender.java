package http;

import java.awt.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by m.simonov on 18.03.2016.
 */
public class HttpSender  {

    private Frame frame;

public HttpSender()throws Exception{


    //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


   // String s = reader.readLine();



}
public String getResp(String urls) throws IOException {


    URL url = new URL("http://");
    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();


    System.out.println("Метод запроса: " + urlConnection.getRequestMethod());

    System.out.println("Код ответа: "+ urlConnection.getResponseCode());

    System.out.println("Сообщение ответа: "+ urlConnection.getResponseMessage());

    //Map<String, List<String>> listMap = urlConnection.getHeaderFields();
    //   Set<String>stringSet = listMap.keySet();


      String  resp = urlConnection.getResponseMessage() + urlConnection.getResponseCode() + urlConnection.getRequestMethod();
return resp;

}



}



