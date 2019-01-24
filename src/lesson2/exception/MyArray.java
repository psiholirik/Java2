package lesson2.exception;

import java.util.Arrays;
import java.util.Random;

class MyArray {

  String[][] newArray(int length, int width, boolean number) {
    String[][] array = new String[length][width];
    System.out.print("Генерация массива: ");
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < width; j++) {
        array[i][j] = String.valueOf(j);
      }
    }
    if (!number) {
      array[randomNumber(length)][randomNumber(width)] = "not a number";
    }
    System.out.println("ОК");
    System.out.println("Печать массива: ");
    printArray(array);
    return array;
  }

  private int randomNumber(int max) {
    return new Random().nextInt(max);
  }

  boolean checkArraySize(String[][] array) {
    System.out.print("Проверка длины: ");
    if (array.length != 4) {
      try {
        throw new MyArraySizeException("Длина массива не соответствует ожидаемой. Ожидалась: 4. Передана: "
                + array.length);
      } catch (MyArraySizeException e) {
        System.out.println(e);
        return false;
      }
    } else {
      System.out.println("ОК");
    }

    System.out.print("Проверка ширины: ");
    if (array[0].length != 4) {
      try {
        throw new MyArraySizeException("Ширина массива не соответствует ожидаемой. Ожидалась: 4. Передана: "
                + array[0].length);
      } catch (MyArraySizeException e) {
        System.out.println(e);
        return false;
      }
    } else {
      System.out.println("ОК");
    }

    return true;
  }

  String sumOfArrayElements(String[][] array) {
    int sum = 0;

    if(!checkArraySize(array)) {
      return ("Массив некорректный. Сумма не вычислялась");
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        try {
          sum = sum + Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
//          Закомментировал. Приводит к завершению программы
//          throw new MyArrayDataException("В ячейке [" + i + "][" + j + "] найдены некорректные данные. " +
//                  "Сумма элементов не вычислялась");
          return "В ячейке [" + i + "][" + j + "] найдены некорректные данные. Сумма элементов не вычислялась";
        }
      }
    }
    return String.valueOf(sum);
  }

  private void printArray(String[][] array) {
    for (String[] strings : array) {
      System.out.println(Arrays.toString(strings));
    }
  }
}
