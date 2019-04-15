import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.*;
class client{
    public static void main(String[] args) throws Exception{
        DatagramSocket s =new DatagramSocket();
        System.out.println("Enter the text " );
        Scanner sc = new Scanner(System.in);
        byte[] buffer = sc.nextLine().getBytes();

        //System.out.println(buffer[0]);
        DatagramPacket data  = new DatagramPacket(buffer, buffer.length,InetAddress.getByName("localhost"),6555);
        s.send(data);
         data = new DatagramPacket(buffer, buffer.length);
        	s.receive(data);
        	System.out.println("data from server" +new String(data.getData()));
        s.close();
    }
}