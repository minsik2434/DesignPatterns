package remote_controller4;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println("차고 문 열기");
    }

    public void down(){
        System.out.println("차고 문 닫기");
    }

}
