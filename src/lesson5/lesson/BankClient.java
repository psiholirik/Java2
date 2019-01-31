package lesson5.lesson;

public class BankClient {
  public static void main(String[] args) {
    Bank bank = new Bank();

    Thread client1 = new Thread(()-> {
      bank.take(50);
    });
    Thread client2 = new Thread(()-> {
      bank.take(50);
    });
    Thread client3 = new Thread(()-> {
      bank.take(50);
    });

    client1.start();
    client2.start();
    client3.start();

    try {
      client1.join();
      client2.join();
      client3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    bank.info();
  }
}
