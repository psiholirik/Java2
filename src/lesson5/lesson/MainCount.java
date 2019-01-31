package lesson5.lesson;

public class MainCount {
  public static void main(String[] args) {
    Counter counter = new Counter(0);

    Thread t1 = new Thread(()-> {
      for (int i = 0; i < 1_000_000; i++) {
        counter.dec();
      }
    });

    Thread t2 = new Thread(()-> {
      for (int i = 0; i < 1_000_000; i++) {
        counter.inc();
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join(); // соединяет с основным потоком
      t2.join(); // соединяет с основным потоком
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(counter.getCount());
  }
}
