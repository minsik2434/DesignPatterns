package origin;

public abstract class Pizza {

    public void prepare(){
        System.out.println("준비");
    }
    public void bake(){
        System.out.println("굽기");
    }

    public void cut(){
        System.out.println("자르기");
    }

    public void box(){
        System.out.println("포장하기");
    }
}
