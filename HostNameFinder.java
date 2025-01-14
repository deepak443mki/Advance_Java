import java.net.*;

//public String getHostName() --> Host name String format.
IP address (the system's network address
public class HostNameFinder{
	public static void main(String[] args){
		String host;
		InetAddress address;
		try{
			address = InetAddress.getLocalHost();
			host = address.getHostName();
			System.out.println("Host name - "+host);
		} catch (UnknownHostException e){
			System.out.println("Exception "+e);
		}
	}
}
