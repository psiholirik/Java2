package lesson6.homework.server;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler {

  private Server server;
  private Socket socket;
  private BufferedReader in;
  private BufferedReader reader;
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
            String line = reader.readLine();
            out.write(line);
            String clientResponse = in.readLine();
            System.out.println(clientResponse);
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
