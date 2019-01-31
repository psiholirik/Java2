package lesson5.lesson.consumer;

public class Store {
  private int product = 0;

  public synchronized void get() {
    while (product < 1) {
      try {
        wait(); //ожидание выполнения условия
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    product--;
    System.out.println("Купили продукт: " + product);
    notify();//отпустить поток
  }

  public synchronized void put() {
    while (product >= 3) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    product++;
    System.out.println("Доложили продукт: " + product);
    notify();//отпустить поток
  }
}
