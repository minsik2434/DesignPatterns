package origin;

public class MallardDuck extends Duck{
    @Override
    void quack() {
        System.out.println("quack");
    }

    @Override
    void swim() {
        System.out.println("swim");
    }

    @Override
    void display() {
        System.out.println("MallardDuck");
    }

    @Override
    void fly() {

    }
}
