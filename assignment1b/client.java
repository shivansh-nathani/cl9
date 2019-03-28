import java.rmi.*; 
import java.rmi.registry.*;  

 class client {  
   
   public static void main(String[] args) {  
      try {  
        
         Registry registry = LocateRegistry.getRegistry(); 
    
      
         inf stub = (inf) registry.lookup("inf"); 
    
       
         
         
          System.out.println(stub.add(5,6)); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}