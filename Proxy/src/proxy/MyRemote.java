package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

//RMI에서 remote는 특별한 의미를 가지므로 반드시 확장해야한다
public interface MyRemote extends Remote {
    //원격 메서드 호출 중 네트워크에 문제가 발행할 수 있으므로 RemoteException을 던지도록 구현
    public String sayHello() throws RemoteException;
}
