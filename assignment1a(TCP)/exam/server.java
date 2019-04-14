import java.io.DataInput;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class server{
public static void main(String[] args) throws Exception {
ServerSocket ss = new ServerSocket(6969);
while(true){
Socket s = ss.accept();
System.out.println(s.toString());
DataInputStream dis = new DataInputStream(s.getInputStream());
Thread t = new handler(s, dis);
t.start();
}
}
}

class handler extends Thread{
Socket s = null;
DataInputStream dis = null;

public handler(Socket s,DataInputStream dis)
{
this.s= s;
this.dis= dis;
}
public void run() {
try{

System.out.println(dis.readUTF());

}
catch(Exception e)
{

}
}
}