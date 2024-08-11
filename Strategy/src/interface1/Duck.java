package interface1;

/**
 * Flyable이라는 인터페이스와 Quackable이라는 인터페이스를 생성후 서브 클래스에서
 * 그 인터페이스의 메소드 (quack(), flay() 메서드를 구현)
 * -> 이 방법은 슈퍼 클래스의 fly() 와 quack()를 분리해 인터페이스를 구현하고 서브 클래스에서 사용하고 있지만
 * 이 방법 역시 fly()나 quack()이 변경될때 fly()와 quack()을 사용하는 서브 클래스의 함수를 모두 변경해야한다
 * 유지 보수적으로 좋지 않은 방법
 * 예) 날아가는 방법이 날개짓으로 날아가는 방법에서 로켓 추진을 통해 날아가는 방법으로 바뀔때 모든 서브 클래스의 fly()를 변경해야함
 */
public abstract class Duck {
    abstract void swim();
    abstract void display();
}
