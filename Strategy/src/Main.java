import interface2.Duck;
import interface2.MallardDuck;
import interface2.ModelDuck;
import interface2.behavior.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        //실행 시점에 동적으로 flyRocketPowered 갈아끼움
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}