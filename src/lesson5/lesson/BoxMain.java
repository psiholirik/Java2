package lesson5.lesson;

public class BoxMain {
  public static void main(String[] args) {
    Box box = new Box();
    new Thread(() -> box.doSome()).start();
    new Thread(() -> box.doSome()).start();
  }
}
