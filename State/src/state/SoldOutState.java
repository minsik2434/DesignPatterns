package state;

public class SoldOutState implements State{
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진되었습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣지 않았습니다 동전을 반환하지 않습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진되었습니다");
    }

    @Override
    public void dispense() {
        System.out.println("매진입니다");
    }
}
