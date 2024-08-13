package factory3;

import factory3.ingredient_factory.NYPizzaIngredientFactory;
import factory3.type.CheesePizza;
import factory3.type.PepperoniPizza;
import factory3.type.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        } else if (type.equals("clam")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }
        return pizza;
    }
}
