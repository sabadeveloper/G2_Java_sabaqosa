package saba;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread Client = new Thread(new Client());
        Thread Server =new Thread(new Server());
        Client.start();
        Server.start();
    }
}
