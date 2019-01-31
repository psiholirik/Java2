package lesson5.lesson;

public class Bank {
  private int cash = 100;

  public void info() {
    System.out.println("Остаток по счету: " + cash);
  }

  public synchronized void take(int money) {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    if (cash >= money) {
      cash -= money;
      System.out.println("Пользователь снял: " + money);
    }
  }
}
