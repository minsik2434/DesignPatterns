package interface2.behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
