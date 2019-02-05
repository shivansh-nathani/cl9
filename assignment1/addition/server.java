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
        
        
       
        int number1 = Integer.parseInt(is.readUTF());
        System.out.println("Number 1 is : "+number1);
        
        int number2 = Integer.parseInt(is.readUTF());
        System.out.println("Number 2 is : "+number2);
        char op = is.readChar();
        int result;
        //System.out.print(op);
        switch(op)
        {
            case '+':
            result = number1 + number2;
            break;
            case '-':
            result=number1 - number2;
            break;
            case '%':
            result = number1 % number2;
            break;
            default:
            result=0;
        }
        System.out.print("Result Is  : "+result+"\n");
        
        os.writeUTF(String.valueOf(result));
        
        os.flush();
        

        
        
        os.close();
    
        ss.close();
        sv.close();

    }
}