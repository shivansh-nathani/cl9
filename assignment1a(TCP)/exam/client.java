import java.io.DataOutput;
import java.io.*;;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

class client{
public static void main(String[] args) throws Exception{
Socket soc = new Socket("localhost", 6969);
DataOutput dos = new DataOutputStream(soc.getOutputStream());
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two nos");

dos.writeDouble(sc.nextDouble());
dos.writeDouble(sc.nextDouble());
DataInputStream dis = new DataInputStream(soc.getInputStream());
System.out.println("The result of a raised b is" + dis.readDouble());
soc.close();
}
}