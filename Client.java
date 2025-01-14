import java.net.*;
import java.io.*;

public class Client {
	public static void main(String[] args){
		try {
			Socket ss = new Socket("LocalHost", 123);
			System.out.println("Client started...");
			DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
			dout.writeUTF("Hello server I am your client");
			ss.close();
		} catch (Exception e) {
			System.out.println("Exception"+e);
		}
	}
}