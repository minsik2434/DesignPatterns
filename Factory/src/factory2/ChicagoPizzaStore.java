package factory2;

import factory2.type.chicago.ChicagoStyleCheesePizza;
import factory2.type.chicago.ChicagoStyleClamPizza;
import factory2.type.chicago.ChicagoStylePepperoniPizza;
import factory2.type.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")){
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
