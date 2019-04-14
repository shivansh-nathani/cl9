import java.rmi.*; 
import java.rmi.registry.*;  
import java.util.*;
 class client {  
   
   public static void main(String[] args) {  
      try {  
        
         Registry registry = LocateRegistry.getRegistry(); 
    
      
         inf stub = (inf) registry.lookup("inf"); 
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the first No : " );
         String a = s.nextLine();
         System.out.print("Enter the second No : " );
         String b= s.nextLine();

         
         
          System.out.println("Result of Addition is :" + stub.add(a,b)); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}