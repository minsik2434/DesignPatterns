package interface1;

import interface1.able.Flyable;
import interface1.able.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    void swim() {

    }

    @Override
    void display() {

    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
