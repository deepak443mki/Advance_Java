import java.net.*;
import java.io.*;

public class Server{
	public static void main(String[] args){
		try{
			ServerSocket ss = new ServerSocket(123);
			System.out.println("Server started..");
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String)dis.readUTF();
			System.out.println(str);
			ss.close();
		} catch (Exception e){
			System.out.println("Exception"+e);
		}
	}
}