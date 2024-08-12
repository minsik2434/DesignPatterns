package origin;

public class Beverage {
    String description;

    int milkCost = 1;
    int soyCost = 2;
    int mochaCost = 3;
    int whipCost = 4;
    boolean soy;
    boolean milk;

    boolean mocha;
    boolean whip;

    public boolean isSoy() {
        return soy;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isMocha() {
        return mocha;
    }

    public boolean isWhip() {
        return whip;
    }
    public double cost(){
        double condimentCost = 0.0;
        if(isMilk()){
            condimentCost += milkCost;
        }
        if(isSoy()){
            condimentCost += soyCost;
        }
        if(isMocha()){
            condimentCost += mochaCost;
        }
        if(isWhip()){
            condimentCost += whipCost;
        }
        return condimentCost;
    }
}
