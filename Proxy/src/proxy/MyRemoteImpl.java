package proxy;

import java.io.Serial;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//서비스 클래스에 원격 인터페이스를 구현 클라이언트가 인터페이스 메서드를 호출
//UnicastRemoteObject를 확장
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    @Serial
    private static final long serialVersionUID = 1L;
    @Override
    public String sayHello() throws RemoteException {
        return "Server says 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException{
    }

    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            //서비스를 RMI 레지스트리에 등록한다 등록할때는 이름을 지정해주어야하는데 클라이언트는 이 이름으로 레지스트리를 검색한다
            //rebind() 메서드로 서비스 객체를 결합하면 RMI 서비스에 해당하는 스텁을 레지스트리에 추가한다
            Naming.rebind("RemoteHello", service);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
