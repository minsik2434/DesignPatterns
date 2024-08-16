package facade.equipment;

public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;

    public void on(){
        System.out.println("앰프를 킨다");
    }

    public void off(){
        System.out.println("앰프를 끈다");
    }
    public void setStereoSound(){
        System.out.println("스테레오 사운드");

    }
    public void setStreamingPlayer(StreamingPlayer streamingPlayer){
        this.player = streamingPlayer;
    }

    public void setTuner(Tuner tuner){
        this.tuner =tuner;
    }
    public void setVolume(int volume){
        System.out.println("볼륨을 " +volume +"으로 설정");
    }

}
