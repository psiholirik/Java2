package lesson6.homework.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler {

  private Server server;
  private Socket socket;
  private DataInputStream in;
  private DataOutputStream out;

  public ClientHandler(Server server, Socket socket) {
    this.server = server;
    this.socket = socket;

    this.in = null;
    this.out = null;
    try {
      in = new DataInputStream(socket.getInputStream());
      out = new DataOutputStream(socket.getOutputStream());

      new Thread(() -> {
        try {
          while (true) {
            String line = in.readUTF();
            System.out.println("from client:" + line);
            sendMessage();
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
      }).start();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void sendMessage() throws IOException {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    out.writeUTF(str);
  }
}
