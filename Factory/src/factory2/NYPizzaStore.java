package factory2;

import factory2.type.ny.NYStyleCheesePizza;
import factory2.type.ny.NYStyleClamPizza;
import factory2.type.ny.NYStylePepperoniPizza;
import factory2.type.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        else return null;
    }
}
