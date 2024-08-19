package proxy2;

public class NoQuarterState implements State {
    //State를 구현하는 모든 클래스에서 GumballMachine 인스턴스 변수를 선언하는 부분에 transient 키워드를 추가한다
    //이러면 JVM에서 그 필드를 직렿화 하지 않는다
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣었습니다");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요");
    }
}
