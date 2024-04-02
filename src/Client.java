import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Kết nối đến localhost (cùng máy) trên cổng 12345


            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            out.println("Hello from client!");


            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
