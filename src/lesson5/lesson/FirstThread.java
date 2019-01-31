package lesson5.lesson;

public class FirstThread extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
//      Thread.yield(); //передает управление другому потоку
//      try {
//        Thread.sleep(10);//текущий поток останавливается на 10 мс
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
    }
  }
}
