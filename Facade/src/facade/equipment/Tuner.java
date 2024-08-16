package facade.equipment;

public class Tuner {
    Amplifier amplifier;
    public void on(){
        System.out.println("튜너를 킨다");
    }
    public void off(){
        System.out.println("튜너를 끈다");
    }

    public void setAm(Amplifier amplifier){
        this.amplifier = amplifier;
    }

}
