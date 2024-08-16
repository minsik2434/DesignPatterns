package templatemethod;

public class BeverageDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("홍차 준비중");
        teaHook.prepareRecipe();

        System.out.println("커피 준비중");
        coffeeHook.prepareRecipe();
    }
}