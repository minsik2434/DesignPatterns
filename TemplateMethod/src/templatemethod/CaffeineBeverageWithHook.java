package templatemethod;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        //customerWantsCondiments()메서드로 반환값이 true일 때만 addCondiments()를 호출한다
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("물 끓이는 중");
    }

    void pourInCup(){
        System.out.println("컵에 따르는 중");
    }

    //이 메서드는 서브 클래스에서 필요한 경우 오버라이드 할 수 있는 훅 메서드이다
    boolean customerWantsCondiments(){
        return true;
    }
}
