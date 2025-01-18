import java.net.*;

public class URLParts {
    public static void main(String[] args) {
        try{
            URL url  = new URL("http://www.example.com:8080/path/to/file.html?name=johnDeo&Id=123#section");
            System.out.println("Full URL: "+url.toString());
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());
            System.out.println("Query: "+url.getQuery());
            System.out.println("Reference: "+url.getRef());
            
        } catch (MalformedURLException e) {
            System.out.println("INvalid URL "+e.getMessage());
        }
    }
}
