package factory3;

import factory3.ingredient_factory.CaliforniaPizzaIngredientFactory;
import factory3.ingredient_factory.ChicagoPizzaIngredientFactory;
import factory3.type.CheesePizza;
import factory3.type.ClamPizza;
import factory3.type.PepperoniPizza;
import factory3.type.VeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("캘리포니아 치즈 피자");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("캘리포니아 야채 피자");
        } else if (type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("캘리포니아 조개 피자");
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("캘리포니아 페퍼로니 피자");
        }
        return pizza;
    }
}
