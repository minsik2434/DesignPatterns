package interface2;

import interface2.behavior.FlyBehavior;
import interface2.behavior.QuackBehavior;

public abstract class Duck {

    /**
     * flyBehavior 와 quackBehavior 은 Duck 클래스에서 구현하지 않고 다른 클래스에 위임한다
     * 따라서 변경이 일어나도 하위 클래스에서 interface 를 구현한 구현체반 변경해주면 된다
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    abstract void swim();
    abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
}
