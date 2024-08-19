package proxy2;

public class SoldState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("알맹이를 이미 뽑았습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세요");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else{
            System.out.println("out of Gumball");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
