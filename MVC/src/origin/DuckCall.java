package origin;

public class DuckCall implements Quackable{
    Observable observable;
    @Override
    public void quack() {
        System.out.println("꽉꽉");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
