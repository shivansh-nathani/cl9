import java.rmi.server.UnicastRemoteObject;

class impl extends UnicastRemoteObject implements inf{
    public impl(){
        super();
    }
        
   
    public boolean check(String s,String sub)
    {
        if(s.contains(sub))
            return true;
        else
            return false;    
    }
}