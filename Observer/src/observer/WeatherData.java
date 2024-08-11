package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject, DisplayElement{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    //옵저버 객체들을 저장하는 객체
    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //setMeasurements() 메서드로 값이 변하게 되면 measurementsChange()메서드를 실행함
        measurementsChanged();
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F , 습도 " + humidity + "%");
    }
}
