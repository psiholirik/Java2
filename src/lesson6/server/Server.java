package lesson6.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

  private BufferedReader in;
  private BufferedWriter out;

  public Server() {
    ServerSocket server = null;
    Socket socket = null;


    try {
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      server = new ServerSocket(8080);
      System.out.println("server start");
      socket = server.accept();
      while (true) {
        System.out.println("client connected");
        try {
          new Thread(() -> {
            try {
              while (true) {
                String line = in.readLine();
                System.out.println("from client:" + line);
                out.write(line);
                out.flush();
              }
            } catch (IOException e) {
              e.printStackTrace();
            }
          }).start();
        } finally {
          if (socket != null) {
            try {
              socket.close();
            } catch (IOException e) {
              e.printStackTrace();
            }
          }
          if (server != null) {
            try {
              server.close();
            } catch (IOException e) {
              e.printStackTrace();
            }
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
