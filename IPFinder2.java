import java.util.*;
import java.net.*;

//public static InetAddress getLocalHost() --> Host name & IP Address.
public class IPFinder2 {
    public static void main(String[] args) {
        InetAddress address;
        try{
            address = InetAddress.getLocalHost();
            System.out.println("Address - "+address);
        } catch (Exception e) {
            System.out.println("Exception"+e);
        }
    }
}
