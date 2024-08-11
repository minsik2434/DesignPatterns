package pull.display;

import pull.DisplayElement;
import pull.Observer;
import pull.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {
    private float currentPressure = 29.9f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("lastPressure = " + lastPressure);
        System.out.println("currentPressure = " + currentPressure);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
