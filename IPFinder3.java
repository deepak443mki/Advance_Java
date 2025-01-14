import java.net.*;

public class IPFinder3{
	public static void main(String[] args){
		String ipAddress;
		String host;
		InetAddress address;
		try{
			address = InetAddress.getLocalHost();
			host = address.getHostName();
			ipAddress = address.getHostAddress();
			System.out.println("Host name - "+host);
			System.out.println("\n IP address - "+ ipAddress);
		} catch (UnknownHostException e){
			System.out.println("Exception "+e);
		}
	}
}