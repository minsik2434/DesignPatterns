package facade.equipment;

public class TheaterLights {
    public void on(){
        System.out.println("조명을 킨다");
    }

    public void off(){
        System.out.println("조명을 끈다");
    }

    public void dim(int dim){
        System.out.println("밝기를 " + dim + "으로 설정");
    }
}

