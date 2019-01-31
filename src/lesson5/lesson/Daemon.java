package lesson5.lesson;

public class Daemon {
  public static void main(String[] args) {
    Thread timer = new Thread(() -> {
      int sec = 0;
      while (true) {
        sec++;
        System.out.println(sec);
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });

    timer.setDaemon(true); //останавливает все потоки после выполнения основного

    System.out.println("Start");
    timer.start();
    System.out.println("Stop");//конец основного потока
  }
}
