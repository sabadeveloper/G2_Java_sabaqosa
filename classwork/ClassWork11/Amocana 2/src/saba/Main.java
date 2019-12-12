package saba;

public class Main {

    public static void main(String[] args) {
        // write your code here
       Client client = new Client();
       Server server = new Server();
       client.Client_side();
       server.Server_side();
    }
}
