package networking;

import java.net.*;
import java.io.*;

/**
 * GreetingClient.java
 *
 * This program is a client program that connects to a server
 * by using a socket and sends a greeting, and then waits for a response.
 */
public class GreetingClient {

    public static void main(String[] args) {
        String serverName = "localhost";
        int port = 6066;

        try (Socket client = new Socket(serverName, port)) {
            System.out.println("Connecting to " + serverName + " on port "
                    + port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            DataInputStream in = new DataInputStream(client.getInputStream());

            System.out.println("Server says " + in.readUTF());
        } catch (IOException e) {
            System.err.println("Error " + e);
        }
    }
}
