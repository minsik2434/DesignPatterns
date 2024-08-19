package proxy2;

import java.rmi.Remote;
import java.rmi.RemoteException;

//서비스를 제공할 원격 인터페이스를 구현한다 -> GumballMachine 의
//getCount()와 getLocation() getSate()를 클라이언트에서 사용할 수 있음
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
