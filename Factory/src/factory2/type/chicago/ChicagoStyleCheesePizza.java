package factory2.type.chicago;

import factory2.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza(){
        name = "시카고 피자";
        dough = "두꺼운 도우";
        sauce = "토마토 소스";

        toppings.add("모짜렐라 치즈");
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 자르기");
    }
}
