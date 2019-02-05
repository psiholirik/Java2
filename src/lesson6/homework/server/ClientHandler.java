package lesson6.homework.server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler {

  private Server server;
  private Socket socket;
  private BufferedReader in;
  private BufferedWriter out;

  public ClientHandler(Server server, Socket socket) {
    this.server = server;
    this.socket = socket;

    this.in = null;
    this.out = null;
    try {
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
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

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
