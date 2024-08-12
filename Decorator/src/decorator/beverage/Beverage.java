package decorator.beverage;

/**
 * Beverage 는 추상 클래스이며 getDescription 과 cost 라는 두개의 메서드를 가진다
 * getDescription 이미 구현되어 있지만 cost()는 서브 클래스에서 구현해야한다
 */
public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
