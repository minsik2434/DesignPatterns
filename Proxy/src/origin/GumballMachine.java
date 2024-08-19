package origin;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    String location;
    State state;
    int count = 0;

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public GumballMachine(String location, int numberGumballs) {
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.location = location;
        this.count = numberGumballs;

        if(numberGumballs > 0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    void setState(State state){
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    void releaseBall(){
        System.out.println("알맹이를 내보내고 있습니다");
        if(count > 0){
            count = count -1;
        }
    }
}
