package adapter;

import adapter.duck.MallardDuck;
import adapter.turkey.WindTurkey;

public class TurkeyDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WindTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        duck.quack();
        duck.fly();

        testDuck(turkeyAdapter);
    }

    static void testDuck(TurkeyAdapter turkeyAdapter){
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}