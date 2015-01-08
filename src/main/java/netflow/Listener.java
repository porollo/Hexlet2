package netflow;

import java.net.ServerSocket;

/**
 * Created by Spider on 18.11.2014.
 */

public class Listener {
    public void Connect() {

        final int PORT = 8090;

        System.out.println("Listener starting up on port " + PORT);
        System.out.println("(press ctrl-c to exit)");

        try {
            ServerSocket s = new ServerSocket(PORT);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return;
        }

        System.out.println("Server listen on port " + PORT);








    }

}
