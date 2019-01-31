package lesson5.lesson;

public class Box {
  Object object = new Object();

  void doSome() {
    System.out.println(1);
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    synchronized (object) { // этот кусок кода синхронизируется (другой поток не получит к нему доступ)
      System.out.println(11);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(12);
    } //здесь отпускает
    System.out.println(2);
  }
}
