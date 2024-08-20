package origin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Observable에서는 Quackable이 옵저버가 되는데 필요한 모든 기능을 구현한다
//Observable 객체를 다른 클래스에 넣은 다음 필요한 작업을 Observable에 위임하도록 만든다
//Observable은 반드시 QuackObservable을 구현해야한다 QuackObservable에서 정의한 메서드를 Observable에 위임한다
public class Observable implements QuackObservable{
    //생성자의 인자로 이 객체를 써서 QucakObservable로서의 행동을 구현할 QuackObservable 객체가 전달된다
    List<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = iterator.next();
            observer.update(duck);
        }
    }
}
