package factory3;

/**
 * 객체 생성 팩토리를 객체가 아닌 추상 메서드로 선언
 * 이 객체는 추상 클래스이고 이 클래스의 구상 클래스를 생성할때 추상 메서드인 createPizza() 메서드를 구현해야함
 * 이제 스타일에 따라 객체 생성 메서드를 구현해 객체를 생성
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        // 팩토리 객체가 아닌 클라이언트 객체의 객체 생성 함수를 호출
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //팩토리 객체 대신 메서드를 사용한다
    abstract Pizza createPizza(String type);
}
