package remote_controller3;

public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location+" 오디오 켜기");
    }

    public void off(){
        System.out.println(location+" 오디오 끄기");
    }

    public void setCD(){
        System.out.println(location+" 오디오에 CD 넣기");
    }

    public void setDVD(){
        System.out.println(location+" 오디오에 DVD 넣기");
    }

    public void setRadio(){
        System.out.println(location+" 오디오에 라디오 설정하기");
    }

    public void setVolume(int volume){
        System.out.println(location+" 오디오 볼륨 " + volume + " 로 설정됨");
    }
}
