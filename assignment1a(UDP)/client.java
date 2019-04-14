import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class client{
    public static void main(String[] args) throws Exception{
        DatagramSocket s =new DatagramSocket();
        byte[] buffer  = new String("hey").getBytes();
        System.out.println(buffer[0]);
        DatagramPacket data  = new DatagramPacket(buffer, buffer.length,InetAddress.getByName("localhost"),6555);
        s.send(data);
        s.close();
    }
}