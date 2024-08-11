package origin;

//상속을 사용
public abstract class Duck {
    abstract void quack();
    abstract void swim();
    abstract void display();

    /**
     *     나는 행동 추가 --> 하위 클래스 모두 나는 행동이 추가되는 문제가 발생.
     *     특정 클래스만 날 수 있는 경우 하위 클래스의 fly 메서드를 모두 오버라이드 해야한다
     *     이는 유지보수를 생각하면 좋지 않은 방법이다
     */

    abstract void fly();
}
