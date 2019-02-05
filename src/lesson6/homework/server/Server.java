package lesson6.homework.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

  public Server(){
    ServerSocket server = null;
    Socket socket = null;
    try {

      server = new ServerSocket(8080);
      System.out.println("server start");

      while (true) {
        socket = server.accept();
        System.out.println("client connected");
        new ClientHandler(this, socket);
      }

    } catch (IOException e) {
      e.printStackTrace();
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
}
