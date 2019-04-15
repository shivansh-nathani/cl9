import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
class server{
    public static void main(String[] args) throws Exception{
        DatagramSocket s = new DatagramSocket(6555);
        byte[] buffer = new byte[1000];
        //System.out.println(buffer.length);
        while(true)
        {
        	DatagramPacket data = new DatagramPacket(buffer, buffer.length);
        	s.receive(data);
        	String d= new String(data.getData());
        	
        	 buffer = d.getBytes();
        	 InetAddress add = data.getAddress();
        	 int port = data.getPort();
        	 System.out.print("sending data to client "+d+"port "+port+"addr "+add);
        	 data  = new DatagramPacket(buffer, buffer.length,add,port);
        	s.send(data);
        }
        
    }
}