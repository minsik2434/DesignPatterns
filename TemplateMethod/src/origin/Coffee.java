package origin;

public class Coffee {

    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater(){
        System.out.println("물 끓이는 중");
    }

    public void brewCoffeeGrinds(){
        System.out.println("필터로 커피 우려내는 중");
    }

    public void pourInCup(){
        System.out.println("컴에 따르는 중");
    }

    public void addSugarAndMilk(){
        System.out.println("설탕과 우유 추가하는 중");
    }
}
