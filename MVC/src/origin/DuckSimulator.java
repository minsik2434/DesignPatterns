package origin;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        //팩토리를 사용해서 객체를 생성
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        //gooseDuck 객체는 quack()메서드가 아니라 honk()메서드를 호출하므로 데코레이터로 포장하지 않음 ->꽥꽥이 아니라서
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Flock flockOfDucks = new Flock();
        System.out.println("오리 시뮬레이션 게임");

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("전체 무리");
        simulate(flockOfDucks);

        System.out.println("오리 물오리");
        simulate(flockOfMallards);

        System.out.println("옵저버 추가");
        Quacklogist quacklogist = new Quacklogist();
        flockOfDucks.registerObserver(quacklogist);

        System.out.println("오리가 소리낸 횟수 " + QuackCounter.getQuacks() + " 번");

    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
