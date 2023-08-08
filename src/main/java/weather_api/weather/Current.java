package weather_api.weather;

public class Current {
    private int temperature;
    private String obseervation_time;
    private int pressure;
    private int humidity;

    public int getTemperature(){
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public String getObseervation_time(){
        return obseervation_time;
    }
    public void setObseervation_time(String obseervation_time){
        this.obseervation_time = obseervation_time;
    }
    public int getPressure(){
        return pressure;
    }
    public void setPressure(int pressure){
        this.pressure = pressure;
    }
    public int getHumidity(){
        return  humidity;
    }
    public void setHumidity(int humidity){
        this.humidity = humidity;
    }


}
