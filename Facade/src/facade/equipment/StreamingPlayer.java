package facade.equipment;

public class StreamingPlayer {
    Amplifier amplifier;
    public void on(){
        System.out.println("플레이어를 킨다");
    }

    public void off(){
        System.out.println("플레이어를 끈다");
    }

    public void play(String contents){
        System.out.println(contents + "시작");

    }
}
