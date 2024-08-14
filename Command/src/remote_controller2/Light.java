package remote_controller2;

public class Light {
    String location;
    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location+" 불켜짐");
    }
    public void off(){
        System.out.println(location+" 불꺼짐");
    }
}
