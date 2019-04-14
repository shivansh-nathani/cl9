import java.rmi.*;

interface inf extends Remote {
    public String add(String x,String y) throws RemoteException;

} 