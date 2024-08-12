package decorator.decorator;

import decorator.beverage.Beverage;

/**
 * Mocha 는 데코레이터이므로 condimentDecorator를 확장한다
 * Mocha 인스턴스는 Beverage 레퍼런스가 들어있다
 * 감싸고자 하는 음료를 저장하는 인스턴스 변수
 * 인스턴스 변수를 감싸고자 하는 객체로 설정하는 생성자
 */
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "모카";
    }
}
