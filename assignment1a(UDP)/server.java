import java.net.DatagramPacket;
import java.net.DatagramSocket;

class server{
    public static void main(String[] args) throws Exception{
        DatagramSocket s = new DatagramSocket(6555);
        byte[] buffer = new byte[1000];
        //System.out.println(buffer.length);
        DatagramPacket data = new DatagramPacket(buffer, buffer.length);
        s.receive(data);
        System.out.print(new String(data.getData()));
    }
}