package lesson6.homework.client;

import java.io.*;
import java.net.Socket;

public class Client {
  private final String HOST = "localhost";
  private final int PORT = 8080;

  private Socket socket;
  private BufferedReader in;
  private BufferedWriter out;
  private BufferedReader reader;


  Client() {
    try {
      socket = new Socket(HOST, PORT);
      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      reader = new BufferedReader(new InputStreamReader(System.in));

      new Thread(() -> {
        try {
          while (true){
            String message = reader.readLine();
            out.write("client send: " + message + "\n");
            String serverResponse = in.readLine();
            System.out.println(serverResponse);
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
