package remote_controller2;

public class CeilingFan {

    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high(){
        System.out.println(location+" 강풍");
    }

    public void medium(){
        System.out.println(location+" 약풍");
    }

    public void low(){
        System.out.println(location+" 미풍");
    }
    public void off(){
        System.out.println(location+" 선풍기 끄기");
    }
}
