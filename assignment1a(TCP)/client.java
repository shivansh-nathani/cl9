import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class client{
    public static void main(String[] args) throws Exception {
        DataOutputStream os = null;
        DataInputStream is = null;
        Socket soc = new Socket("localhost",6920);
        Scanner sc =new Scanner(System.in);
        String server=new String();
        os = new DataOutputStream(soc.getOutputStream());
        is = new DataInputStream(soc.getInputStream());
        while(!server.equals("bye"))
        {
            
            System.out.print("You say  : ");

            os.writeUTF(sc.nextLine());
            os.flush();
            
           
            server = is.readUTF();
            System.out.println("Server says : "+ server);
           
        }
        
        soc.close();


    }
}