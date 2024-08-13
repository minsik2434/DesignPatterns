package factory2;

import factory2.type.california.CaliforniaStyleCheesePizza;
import factory2.type.california.CaliforniaStyleClamPizza;
import factory2.type.california.CaliforniaStyleVeggiePizza;
import factory2.type.chicago.ChicagoStylePepperoniPizza;

public class CaliforniaPizzaStore extends PizzaStore{

    public CaliforniaPizzaStore(){
    }
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
