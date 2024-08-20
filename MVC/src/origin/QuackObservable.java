package origin;

//Quackable을 다른 객체에서 관측할 수 있게 만드려면 QuackObservable 인터페이스를 구현해서 만들어야한다
public interface QuackObservable {
    //옵저버를 등록하는 메서드 Observer 인터페이스를 구현하는 객체라면 어떤 객체이든 옵저버가 될 수 있다
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
