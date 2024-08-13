package factory3.ingredient_factory;

import factory3.PizzaIngredientFactory;
import factory3.ingredient.*;
import factory3.ingredient.cheese.ReggianoCheese;
import factory3.ingredient.clams.FreshClams;
import factory3.ingredient.dough.ThinCrustDough;
import factory3.ingredient.pepperoni.SlicedPepperoni;
import factory3.ingredient.sauce.MarinaraSauce;
import factory3.ingredient.veggies.Garlic;
import factory3.ingredient.veggies.Mushroom;
import factory3.ingredient.veggies.Onion;
import factory3.ingredient.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams creatClam() {
        return new FreshClams();
    }
}
