package saba;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server implements Runnable {
    ServerSocket serversocket;
    Socket socket;
    /*გვჭირდება რაღაც რაც მიიღებს ინფორმაციას სოკეტიდან */
    ObjectInputStream input;
    ObjectOutputStream out;
    String message;

    @Override
    public void run() {
        try {
            serversocket = new ServerSocket(8080); /* უსმენს 8080 პორტს */
            while (true){

                socket = serversocket.accept(); /*ვეთანხმებით გამოგზავნილ ინფორმაციას */
                input = new ObjectInputStream(socket.getInputStream());/* შეიქმნა ობიექტი რომელიც მიიღებს მოანაცემებს, რომელსაც გამოაგზავნის კლიენტი */
                System.out.println("Client: "+input.readObject());/*კითხულობს და გვაწვდის კლიენტიდან მიღებულ შეტყობინებას */
                out = new ObjectOutputStream(socket.getOutputStream());/*შევქმენით ობიექტი, რომელიც ამზადებს ნადაგს ინფორმაციის კლიენტამდე გასაგზავნად */
                Scanner scanner= new Scanner(System.in);
                message = scanner.nextLine();
                out.writeObject(message);/*ამით სერვერმა ინფორმაცია უნდა დაუბრუნოს კლიენტს */

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
