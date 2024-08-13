package factory;

public class PizzaStore {
    // 팩토리 레퍼런스를 저장함
    SimplePizzaFactory factory;

    // 생성자를 통해 팩토리 객체가 주입됨
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        //팩토리로 객체를 생성 이제 new 연산자로
        //구상 클래스를 생성할 필요 없이 팩토리 클래스에게 객체 생성을 위임
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
