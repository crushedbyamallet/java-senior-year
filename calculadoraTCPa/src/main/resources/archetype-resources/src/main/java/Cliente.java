import java.io.IOException;
importintelli java.net.Socket;
import java.util.Scanner;

public class Cliente {

    static Conexao c;
    static Socket socket;

    public Cliente(){
        try {
            socket = new Socket ("localhost", port: 9600);
        } catch (IOException e) {
            System.err.println("host could not be resolved");
        }
    }
