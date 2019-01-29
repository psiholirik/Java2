package lesson4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {
  public Button sendButton;
  public TextField message;
  public TextArea chat;

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent parent = FXMLLoader.load(getClass().getResource("main.fxml"));

    primaryStage.setTitle("Чат");
    primaryStage.setScene(new Scene(parent));
    //primaryStage.setResizable(false);//блокирует изменение экрана
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }

  public void sendToChatByEnter(KeyEvent keyEvent) {
    if (keyEvent.getCode() == KeyCode.ENTER && message.getText().length() != 0) {
      setTextToChat(message.getText());
    }
  }

  public void sendToChatByButton() {
    if(message.getText().length() != 0) {
      setTextToChat(message.getText());
    }
  }

  private void setTextToChat(String s) {
    message.clear();
    chat.setText(chat.getText() + "Artem: " + s + "\n");
  }
}
