package networking.chat_app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    static Socket s;
    static DataInputStream in;
    static DataOutputStream out;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            s = new Socket("localhost", 1201);
            in = new DataInputStream(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());
            String msg = "";
            System.out.println("Client");
            while (!msg.equals("exit")) {
                msg = in.readUTF();
                System.out.println("Server: " + msg);
                System.out.print("Response: --->  ");
                String response = sc.nextLine();
                out.writeUTF(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
