package factory2.type.california;

import factory2.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza(){
        name = "캘리포니아 스타일";
        dough = "얇은 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 치즈");
    }
}
