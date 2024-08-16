package templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    //coffee 와 tea 는 이 두 메서드를 다른 방식으로
    // 처리하므로 추상 메서드로 만들어 서브 클래스가 처리하도록 함
    abstract void brew();
    abstract void addCondiments();

    // 이 두 메서드는 공통적인 메서드이므로 수퍼 클래스에서 구현
    void boilWater(){
        System.out.println("물 끓이는 중");
    }

    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }
}
