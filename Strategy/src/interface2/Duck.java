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

    public void swim() {
        System.out.println("수영");
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public Duck(){

    }

    //setter 메서드 추가해 실행 시점에 동적으로 바꿀 수 있음
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
