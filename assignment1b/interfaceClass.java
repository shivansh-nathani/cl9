import java.rmi.*;

interface inf extends Remote {
    public int add(int x,int y) throws RemoteException;

} 