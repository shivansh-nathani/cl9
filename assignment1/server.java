import java.net.ServerSocket;
import java.net.Socket;

import java.util.Scanner;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.*;

public class server{
    public static void main(String args[]) throws Exception
    {
        ServerSocket sv = new ServerSocket(6920);

        Socket ss = sv.accept();
        DataInputStream is =null;
        Scanner scanner = new Scanner(System.in);
        String client = new String();
        DataOutputStream os = null;
        os = new DataOutputStream(ss.getOutputStream());
        is =new DataInputStream(ss.getInputStream());
        while(!client.equals("bye"))
        {
        
       
        client = is.readUTF();
        System.out.println("Client says : "+client);
        
        
        System.out.print("You say : ");

        os.writeUTF(scanner.nextLine());
        
        os.flush();
        

        }
        
        os.close();
    
        ss.close();
        sv.close();

    }
}