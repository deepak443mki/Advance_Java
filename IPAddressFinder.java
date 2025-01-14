import java.net.*;

//public String getHostAddress() --> IP Address String format.
public class IPAddressFinder {
    public static void main(String[] args) {
        String ipAddress;
        InetAddress address;
        try {
            address = InetAddress.getLocalHost();
            ipAddress = address.getHostAddress();
            System.out.println("IP Address - "+ ipAddress);
        } catch (Exception e) {
            System.out.println("Exception "+e);
        }
    }
}
