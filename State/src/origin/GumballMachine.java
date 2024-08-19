package origin;

public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == HAS_QUARTER){
            System.out.println("동전을 하나만 넣어주세요");
        }
        else if(state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("동전을 넣었습니다");
        }
        else if(state == SOLD_OUT){
            System.out.println("매진 되었습니다");
        }
        else if(state == SOLD){
            System.out.println("알맹이를 내보내고 있습니다");
        }
    }

    public void ejectQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("동전이 반환됩니다");
            state = NO_QUARTER;
        }
        else if(state == NO_QUARTER){
            System.out.println("동전을 넣어주세요");
        }
        else if(state == SOLD){
            System.out.println("이미 알맹이를 뽑았습니다");
        }
        else if(state == SOLD_OUT){
            System.out.println("동전을 넣지 않았습니다 동전이 반환되지 않습니다");
        }
    }

    public void turnCrank(){
        if(state == SOLD){
            System.out.println("손잡이는 한번만 돌려주세요");
        }
        else if(state == NO_QUARTER){
            System.out.println("동전을 넣어주세요");
        }
        else if(state == SOLD_OUT){
            System.out.println("매진되었습니다");
        }
        else if(state == HAS_QUARTER){
            System.out.println("손잡이를 돌렸습니다");
            state = SOLD;
            dispense();
        }
    }

    public void dispense(){
        if(state == SOLD){
            System.out.println("알맹이를 내보내고 있습니다");
            count = count - 1;
            if(count == 0){
                System.out.println("더이상 알맹이가 없습니다");
                state = SOLD_OUT;
            }
            else{
                state = NO_QUARTER;
            }
        }
        else if(state == NO_QUARTER){
            System.out.println("동전을 넣어주세요");
        }
        else if (state == SOLD_OUT){
            System.out.println("매진입니다");
        }
        else if (state == HAS_QUARTER){
            System.out.println("알맹이를 내보낼 수 없습니다");
        }
    }

    @Override
    public String toString() {
        String result = "남은 개수 : " + count;

        if(state == SOLD_OUT){
            result += "\n 매진";
        }
        else{
            result += "\n 동전 투입 대기중";
        }
        return result;
    }
}
