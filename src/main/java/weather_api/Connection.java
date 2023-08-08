package weather_api;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    private static final String apiKey = "5ff0ab97002494fe4313eecdc63250a3";

    public  String getJson(String city) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL("http://api.weatherstack.com/current?access_key" + apiKey + "&query=" + city);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while(scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }
        System.out.println("от сервера пришел ответ:" + stringBuilder);
        return stringBuilder.toString();
    }

}
