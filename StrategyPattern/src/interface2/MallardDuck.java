package interface2;

import interface2.behavior.FlyWithWings;
import interface2.behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    void swim() {

    }

    @Override
    void display() {

    }
}
