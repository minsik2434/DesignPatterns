package ex;

public class SingletonDCL {
    private volatile static SingletonDCL uniqueInstance;

    private SingletonDCL(){}

    public static SingletonDCL getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonDCL.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonDCL();
                }
            }
        }
        return uniqueInstance;
    }
}
