package Diag;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by Spider on 17.02.2015.
 */

public class Ping {

    private final static String ADDRESS = "193.168.10.1";
    private final static int TIMEOUT = 3000;
    private static final String CHARSET = "UTF-8";
    private static final String DIR = "logs";
    private static final String FILENAME = "ip.list";

    private static final int COUNT = 10;


    public void readFromFile() {

        Charset charset = Charset.forName(CHARSET);

        Path file = FileSystems.getDefault().getPath(DIR, FILENAME);

        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

    }


    public void ping() throws IOException {

        InetAddress address = InetAddress.getByName(ADDRESS);
        System.out.println("Name: " + address.getHostName());
        System.out.println("Address: " + address.getHostAddress());
        boolean avail = address.isReachable(TIMEOUT);
        System.out.println("Avaliable: " + avail);
    }

    public String messageStart() {
        System.out.println("Start...");
        return null;
    }

    public void messageStop() {
        System.out.println("Stop...");
    }




}
