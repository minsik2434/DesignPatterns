import observer.WeatherData;
import observer.display.CurrentConditionsDisplay;
import pull.display.ForecastDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        pull.WeatherData weatherData1 = new pull.WeatherData();

        //해당 디스플레이가 생성자로 weatherData 의 옵저버로 등록
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData1);
        //weatherData.setMeasurements() 메서드로 weatherData(주제)의
        // 데이터가 변경될 때 마다 디스플레이의 update()함수가 실행됨
        // update 함수가 실행되면 디스플레이의 필드가 업데이트 되고 display()메서드로 값이 출력
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData1.setMeasurements(90,30, 25.f);
    }
}