package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Beverage 클래스를 확장
 * 각 데코레이터가 감쌀 음료를 나타내는 beverage 객체를 지정 (레퍼런스) 음료를 지정할 때는 데코레이터에서 어떤 음료든 감쌀 수
 * 있도록 Beverage 슈퍼 클래스 유형을 사용
 * 모든 첨가물 데코레이터에 getDescription() 메서드를 새로 구현하도록 함
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
