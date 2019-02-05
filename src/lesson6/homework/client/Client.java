package lesson6.homework.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  private final String HOST = "localhost";
  private final int PORT = 8080;

  private Socket socket;
  private DataInputStream in;
  private DataOutputStream out;

  Client() {
    try {
      socket = new Socket(HOST, PORT);
      in = new DataInputStream(socket.getInputStream());
      out = new DataOutputStream(socket.getOutputStream());

      new Thread(() -> {
        try {
          while (true){
            String message = in.readUTF();
            System.out.println("from server:" + message);
            sendMessage();
          }
        } catch (IOException e) {
          e.printStackTrace();
        }finally {
          if (socket!=null) {
            try {
              socket.close();
            } catch (IOException e) {
              e.printStackTrace();
            }
          }
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
