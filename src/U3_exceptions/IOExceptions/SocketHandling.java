package U3_exceptions.IOExceptions;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketHandling {

    public static void main(String[] args) {
        String serverAddress ="example.com";
        int port =8080;

        try{
            Socket socket = new Socket(serverAddress,port);

        }catch (UnknownHostException e){
            System.out.println("Hosti i panjohur");
        }catch (IOException e){
            System.out.println("Gabim gjat krijimit te lidhjes");
        }
    }
}
