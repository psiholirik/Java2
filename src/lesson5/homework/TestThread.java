package lesson5.homework;

class TestThread {
  private static final int size = 10_000_000;
  private static final int h = size / 2;

  void oneThread() {
    float[] array = new float[size];

    for (int i = 0; i < array.length; i++) {
      array[i] = 1;
    }

    System.out.println("Старт обработки массива в 1 поток");
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < array.length; i++) {
      array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }

    long finishTime = System.currentTimeMillis();
    System.out.println("Завершение обработки массива в 1 поток. Время выполнения: " + (finishTime - startTime)
            + " мс");
  }

  void twoThreads() {
    float[] array = new float[size];
    float[] arr1 = new float[h];
    float[] arr2 = new float[h];

    for (int i = 0; i < array.length; i++) {
      array[i] = 1;
    }

    System.out.println("Старт обработки массива в 2 потока");
    long startTime = System.currentTimeMillis();

    System.arraycopy(array, 0, arr1, 0, h);
    System.arraycopy(array, h, arr2, 0, h);

    Thread thread1 = new Thread(()-> {
      for (int i = 0; i < arr1.length; i++) {
        arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
      }
    });

    Thread thread2 = new Thread(()-> {
      for (int i = 0; i < arr2.length; i++) {
        arr2[i] = (float)(arr2[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f
                + (i + h) / 2));
      }
    });

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.arraycopy(arr1, 0, array, 0, h);
    System.arraycopy(arr2, 0, array, h, h);

    long finishTime = System.currentTimeMillis();
    System.out.println("Завершение обработки массива в 2 потока. Время выполнения: " + (finishTime - startTime)
            + " мс");
  }
}
