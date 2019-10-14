package networking.chat_app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    static ServerSocket ss;
    static Socket s;
    static DataInputStream in;
    static DataOutputStream out;

    public static void main(String[] args) {
        String msg = " ";

        try (Scanner sc = new Scanner(System.in)) {
            ss = new ServerSocket(1201); // server stats on prt number 1201
            System.out.println("Waiting for a client");
            s = ss.accept(); // now server will accept the connection
            in = new DataInputStream(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());

            System.out.println("Server");
            System.out.println("Start texting");
            while (!msg.equals("")) {
                String serverMsg = sc.nextLine();
                out.writeUTF(serverMsg); // sending message to the client

                msg = in.readUTF();
                System.out.println("Client: " + msg);
                System.out.print("Response: --->  ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
