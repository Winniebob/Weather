package weather_api;

import weather_api.weather.Weather;

public class WeatherService implements Service{
    private  Connection connection;
    private Formatter formatter;

    private static final String EMPTY_ERROR = "Don't entered a city ";
    private static final String CITY_ERROR = "Неверное название города";

    public WeatherService(){
        connection = new Connection();
        formatter = new Formatter();
    }

    @Override
    public String get(String city) {
        if(city.equals("")){
            return  EMPTY_ERROR;
        }
        try{
            String info = connection.getJson(city);
            Weather weather = formatter.parse(info);
            String answer = weather.toString();
            return answer;
        } catch (NullPointerException e){
            e.printStackTrace();
            return CITY_ERROR;
        } catch (Exception e){
            e.printStackTrace();
            return  e.getMessage();
        }
    }
}