package remote_controller4;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location+" 강풍");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location+" 약풍");
    }

    public void low(){
        speed = LOW;
        System.out.println(location+" 미풍");
    }
    public void off(){
        speed = OFF;
        System.out.println(location+" 선풍기 끄기");
    }

    public int getSpeed(){
        return speed;
    }
}
