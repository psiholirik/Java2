package lesson5.lesson;

class Counter {
  private int count;

  Counter(int count) {
    this.count = count;
  }

  synchronized void inc() { //synchronized - в один момент времени только один поток имеет доступ к методу
    count++;
  }

  synchronized void dec() { // без synchronized - будет некорректный результат
    count--;
  }

  int getCount() {
    return count;
  }
}
