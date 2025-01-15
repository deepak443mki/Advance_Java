import java.io.*;
import java.net.*;

public class URLConnection {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.gmail.com");
            URL url = uri.toURL();
            // Correcting class name conflict with "URLConnection"
            java.net.URLConnection connection = url.openConnection();
            connection.setConnectTimeout(50000); // Corrected method name
            connection.setReadTimeout(50000);   // Corrected method name
            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // Fixed capitalization
            String line;
            while ((line = reader.readLine()) != null) { // Fixed condition logic and variable names
                System.out.println(line);
            }
            reader.close();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
