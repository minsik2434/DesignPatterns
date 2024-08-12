import decorator.beverage.Beverage;
import decorator.beverage.DarkRoast;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.decorator.Mocha;
import decorator.decorator.Soy;
import decorator.decorator.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.print("beverage.getDescription() = " + beverage.getDescription());
        System.out.println(" beverage.cost() = " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.print("beverage2.getDescription() = " + beverage2.getDescription());
        System.out.println(" beverage2.cost() = " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.print("beverage3.getDescription() = " + beverage3.getDescription());
        System.out.println(" beverage3.cost() = " + beverage3.cost());
    }
}