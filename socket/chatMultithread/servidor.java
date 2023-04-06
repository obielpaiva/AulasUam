package chatMultithread;

import java.io.*;
import javax.swing.*;
import java.net.*;

public class servidor { {
    public static void main(String[] args) throws IOException {
        System.out.println("Servidor iniciado...");
        ServerSocket socketServidor = new ServerSocket(5000);
        Socket socketClient = socketServidor.accept();
        PrintWriter out = new PrintWriter(socketClient.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
        EscutaThread escuta = new EscutaThread(in);
        escuta.start();
        String entrada;
        while (true){
            entrada = JOptionPane.showInputDialog(null, "Mensagem para o cliente", "Servidor", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("Servidor" +entrada);
            out.println(entrada);

        }
            
        }
    }
    
}
