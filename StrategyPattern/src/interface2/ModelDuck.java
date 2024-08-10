package interface2;

import interface2.behavior.FlyNoWay;
import interface2.behavior.Quack;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("모형 오리");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
