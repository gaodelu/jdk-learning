package com.mochi.jdk13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {


    public static void main(String[] args) throws Exception {
        System.out.println("======Server======");
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Server port:" + server.getLocalPort());
        System.out.println("Wait connect...");
        Socket socket = server.accept();
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String msg = reader.readLine();
        System.out.println("Server received :" + msg);
        if (msg.equals("123123")) {
            writer.println("456456");
        } else {
            writer.println("789789");
        }
        writer.flush();
        System.out.println("Server close");
        System.out.println("================");
    }

}
