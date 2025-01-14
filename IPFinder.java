import java.net.*;
import java.util.*;

//public static InetAddress getByName(Host_name) --> Host name & IP Address.
public class IPFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String host;
        InetAddress address;
        System.out.println("\n Enter Host Name: ");
        host = input.nextLine();
        try{
            address = InetAddress.getByName(host);
            System.out.println("IP Address - "+address);
        } catch (UnknownHostException e) {
            System.out.println("Could not found"+host);
        }
    }
}
