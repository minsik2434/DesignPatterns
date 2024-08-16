package adapter;


// 어댑터는 기존 인터페이스를 구현해야한다 -> 기존의 메서드 등을 그대로 사용해야 하기 때문
public class TurkeyAdapter implements Duck{
    //변경할 인터페이스 레퍼런스를 구현
    Turkey turkey;

    //생성자를 통해서 초기화
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //기존 시스템(Duck) 인터페이스의 메서드(quack())에 맞게 turkey.gobble()메서드를 변환
    @Override
    public void quack() {
        turkey.gobble();
    }

    //기존 시스템(Duck) 인터페이스의 메서드(fly())에 맞게 turkey.fly() 메서드를 변환
    @Override
    public void fly() {
        for (int i=0; i<5; i++){
            turkey.fly();
        }
    }
}
