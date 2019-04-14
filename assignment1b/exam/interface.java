import java.rmi.*;

interface inf extends Remote{
    public boolean check(String s,String sub ) throws RemoteException;
}