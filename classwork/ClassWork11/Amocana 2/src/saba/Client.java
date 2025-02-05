package saba;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client  {
    Socket socket;
    String message;
    String IP;
    ObjectOutputStream out;
    ObjectInputStream input;



    public void Client_side() {
        try {

            while (true) {
                socket = new Socket(InetAddress.getByName("localhost"), 8081);/*ვქმნით სოკეტის ტიპის ობიექტს რათა დაადგინოს სად გააგზავნოს ინფო */
                out = new ObjectOutputStream(socket.getOutputStream());/*გააგზავნე მონაცემები არხში. და რომელ არხში?(socket.getOutputStream()-აი ამ არხში */
                Scanner scanner = new Scanner(System.in);
                message = scanner.nextLine();
                out.writeObject(message);/*გავაგზავნეთ ინფორმაცია, რომელიც კლიენტმა შემოიტანა(message) */
                if (message.equals("bye")) {
                    //Thread.currentThread().interrupt();/*Thread გაითიშოს */
                    System.exit(0);
                    break;
                }
                input = new ObjectInputStream(socket.getInputStream());/*ვამზადებთ ნიადაგს, რათა მოვისმინოთ რას გვეტყვის სერვერი */
                System.out.println("Server: " + input.readObject());
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
