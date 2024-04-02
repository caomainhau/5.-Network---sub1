import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Khởi tạo socket server với cổng 12345
            System.out.println("Server is running and waiting for client to connect...");


            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");


            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


            String receivedText = in.readLine();
            System.out.println("Received from client: " + receivedText);


            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
