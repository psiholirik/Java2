package lesson7.server;

import lesson7.server.impl.CsvAuthService;
import lesson7.server.model.Client;
import lesson7.server.task.AuthenticationTask;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

  private List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());

  public Server(){
    ServerSocket server = null;
    Socket socket = null;
    try {

      server = new ServerSocket(8080);
      System.out.println("server start");

      while (true) {
        socket = server.accept();
        System.out.println("client connected");
        new AuthenticationTask(socket, this, new CsvAuthService()).start();
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

  public void broadCast(String msg){
    for (ClientHandler handler: clients){
      handler.sendMsg(msg);
    }
  }

  public void subscribe(ClientHandler client) {
    clients.add(client);
  }

  public void unsubscribe(ClientHandler client){
    clients.remove(client);
  }
}
