package pull;

public interface Observer {
    //pull 방식이므로 인자 없이 호출하도록 수정
    public void update();
}
