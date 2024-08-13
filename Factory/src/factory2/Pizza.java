package factory2;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void prepare(){
        System.out.println("준비중 :" + name);
        for(String topping : toppings){
            System.out.println(" " + topping);
        }

    }
    public void bake(){
        System.out.println("굽기");
    }

    public void cut(){
        System.out.println("자르기");
    }

    public void box(){
        System.out.println("포장하기");
    }

    public String getName(){
        return name;
    }
}
