import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.*;
class server extends Implemented {
    public static void main(String[] args) throws RemoteException {
        try{
          
         Remote obj = new Implemented(); 
    
        
         inf stub = (inf) UnicastRemoteObject.exportObject(obj,0);  
         
       
         Registry registry = LocateRegistry.getRegistry(); 
         System.out.print(registry);
         registry.bind("inf", stub);  
         System.err.println("Server ready"); 
        }
        catch(Exception e)
        {
            System.out.print("hey"+e);
        }
        
    }
   
}