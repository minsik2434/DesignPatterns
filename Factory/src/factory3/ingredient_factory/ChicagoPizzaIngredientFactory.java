package factory3.ingredient_factory;

import factory3.PizzaIngredientFactory;
import factory3.ingredient.*;
import factory3.ingredient.cheese.MozzarellaCheese;
import factory3.ingredient.clams.FrozenClams;
import factory3.ingredient.dough.ThickCrustDough;
import factory3.ingredient.pepperoni.SlicedPepperoni;
import factory3.ingredient.sauce.PlumTomatoSauce;
import factory3.ingredient.veggies.BlackOlive;
import factory3.ingredient.veggies.EggPlant;
import factory3.ingredient.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Spinach(), new BlackOlive(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams creatClam() {
        return new FrozenClams();
    }
}
