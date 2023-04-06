package chatMultithread;

import java.io.*;
import javax.swing.*;
import java.net.*;
import java.net.Socket;
import javax.swing.JOptionPane;

public class cliente {
    public static void main(String args[]) throws IOException {

    System.out.println("Cliente Iniciado...");
    Socket socket = new Socket("Localhost",5000);
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    BufferedReader in = new BufferedReader(new InputStreamReader((socket.getInputStream())));
    EscutaThread escuta = new EscutaThread(in);
    escuta.start();
    String entrada = "";
    while (true){
        entrada = JOptionPane.showInputDialog(null, "Mensagem para o servidor","Cliente",JOptionPane.INFORMATION_MESSAGE);
        out.println(entrada);
        System.out.println("Cliente" +entrada);
        }
    }

  }   
