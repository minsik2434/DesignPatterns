import factory2.*;

/**
 * 캘리포니아 매장에서 치즈 피자 주문하면 캘리포니아 스타일의 치즈피자가 만들어짐
 * 시카고 매장에서 치즈 피자 주문하면 시카고 스타일 치즈 피자가 만들어짐
 */
public class Main {
    public static void main(String[] args) {
        //California 피자 매장에 createPizza()메서드는 캘리포니아 스타일의 피자를 생성
        PizzaStore californiaStore = new CaliforniaPizzaStore();
        //Chicago 피자 매장에 createPizza()메서드는 시카고 스타일의 피자를 생성
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = californiaStore.orderPizza("cheese");
        System.out.println("캘리포니아 스타일 피자 주문 " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("시카고 스타일 피자 주문" + pizza.getName());


        factory3.PizzaStore nyPizzaStore = new factory3.NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

    }
}