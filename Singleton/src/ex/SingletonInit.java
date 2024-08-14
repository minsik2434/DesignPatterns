package ex;

public class SingletonInit {
    private static SingletonInit uniqueInstance = new SingletonInit();

    private SingletonInit(){
    }

    public static SingletonInit getInstance(){
        return uniqueInstance;
    }
}
