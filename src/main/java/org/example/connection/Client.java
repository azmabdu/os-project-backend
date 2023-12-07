package org.example.connection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int PORT = 8080;

        try {
            // Connect to the C server
            Socket socket = new Socket(SERVER_IP, PORT);

            // Create streams for communication
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Get input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter calculation (e.g., 10 + 5): ");
            String calculation = scanner.nextLine();

            // Send the calculation to the C server
            out.println(calculation);

            // Receive the result from the C server
            String result = in.readLine();
            System.out.println("Result from server: " + result);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

