package factory;

import factory.type.CheesePizza;
import factory.type.ClamPizza;
import factory.type.PepperoniPizza;
import factory.type.VeggiePizza;

/**
 * 이 클래스에서 하는일은 클라이언트가 받을 객체를 생성하는 역할만 함
 * 이렇게 캡슐화 하면 조금 다른 방식의 클라이언트 클래스에서도 이 팩토리를 사용할 수 있다
 * 이러면 변경이 일어났을때 여러 클라이언트를 고칠 필요 없이 해당 팩토리만 변경하면 된다
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
