package lesson6.homework.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Controller {
  private final String HOST = "localhost";
  private final int PORT = 8080;

  private Socket socket;
  private DataInputStream in;
  private DataOutputStream out;

  Controller() {
    try {
      socket = new Socket(HOST, PORT);
      in = new DataInputStream(socket.getInputStream());
      out = new DataOutputStream(socket.getOutputStream());

      new Thread(() -> {
        try {
          while (true){
            String message = in.readUTF();
            System.out.println("from server:" + message);
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
}
