package lesson5.homework;

public class Main {
  public static void main(String[] args) {
    TestThread testThread = new TestThread();

    testThread.oneThread();
    testThread.oneThread();
    testThread.oneThread();

    testThread.twoThreads();
    testThread.twoThreads();
    testThread.twoThreads();
  }
}
