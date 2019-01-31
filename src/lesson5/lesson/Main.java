package lesson5.lesson;

public class Main {
  public static void main(String[] args) {
    //------первый способ
    FirstThread thread0 = new FirstThread();
    FirstThread thread1 = new FirstThread();

    //создается новый поток .start()
    thread0.start();
    thread1.start();

    //работают в одном потоке. Неправильно
//    thread1.run();
//    thread2.run();

    //------второй способ
    Thread thread2 = new Thread(new FirstRunnable());
    Thread thread3 = new Thread(new FirstRunnable());

    thread2.start();
    thread3.start();

    //------третий способ
    Thread thread4 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 100; i++) {
          System.out.println(Thread.currentThread().getName() + " " + i);
        }
      }
    });
    thread4.start();
  }
}
