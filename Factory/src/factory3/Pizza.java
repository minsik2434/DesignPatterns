package factory3;

import factory3.ingredient.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract void prepare();
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

    public String toString(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
