package origin;

public class WeatherData {

    CurrentConditionsDisplay currentConditionsDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;

    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        //구현 클래스에 맞춰서 코딩하여 다른 디스플레이가 추가되면 코드를 수정해야한다
        //setter 메서드가 없으므로 실행중에 동적으로 디스플레이를 더하거나 뺄 수 없다
        //디스플레이를 update 하는 부분은 변하는 부분이므로 분리하여 캡슐화 해야한다
        currentConditionsDisplay.update(temp,humidity,pressure);
        statisticsDisplay.update(temp,humidity,pressure);
        forecastDisplay.update(temp,humidity,pressure);

    }

    float getTemperature(){
        return 1;
    }

    float getHumidity(){
        return 1;
    }

    float getPressure(){
        return 1;
    }
}
