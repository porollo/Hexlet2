package Diag;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Spider on 17.02.2015.
 */
public class Main {


    public static void main(String[] args) throws IOException {

        Ping ping = new Ping();

        ping.readFromFile();

        ping.messageStart();

        try {
            ping.ping();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ping.messageStop();

    }


}
