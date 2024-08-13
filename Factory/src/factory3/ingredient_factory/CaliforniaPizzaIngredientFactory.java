package factory3.ingredient_factory;

import factory3.PizzaIngredientFactory;
import factory3.ingredient.*;
import factory3.ingredient.cheese.GoatCheese;
import factory3.ingredient.clams.FreshClams;
import factory3.ingredient.dough.VeryThinCrustDough;
import factory3.ingredient.pepperoni.SlicedPepperoni;
import factory3.ingredient.sauce.BruschettaSauce;
import factory3.ingredient.veggies.BlackOlive;
import factory3.ingredient.veggies.Mushroom;
import factory3.ingredient.veggies.Onion;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new BlackOlive(), new Mushroom()};
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
