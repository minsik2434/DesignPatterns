package proxy;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    
    public void go(){
        try{
            //레지스트리에서 리턴된 객체는 Object 형식이므로 캐스팅 해야한다
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            
            //서비스 객체(스텁)의 메서드 호출
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
