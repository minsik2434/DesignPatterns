package pull;

public interface Subject {
    //옵저버를 등록하기 위한 메서드
    public void registerObserver(Observer o);
    //옵저버를 제거하기 위한 메서드
    public void removeObserver(Observer o);
    //옵저버들에게 메시지를 보내기 위한 메서드
    public void notifyObservers();
}
