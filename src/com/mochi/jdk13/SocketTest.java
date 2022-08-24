package com.mochi.jdk13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class SocketTest {

    public static void main(String[] args) throws IOException {
        System.out.println("======Client======");
        System.out.println("Connecting...");
        Socket socket = new Socket("localhost",8080);
        socket.setSoTimeout(1000);
        System.out.println("Connect Success!");
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer.println("123123");
        writer.flush();
        String msg = reader.readLine();
        System.out.println("Client received :" + msg);
        System.out.println("Client close");
        System.out.println("================");
    }
}
