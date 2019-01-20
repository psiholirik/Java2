package lesson2.exception;

public class Main {
  public static void main(String[] args) {
    MyArray myArray = new MyArray();

    String[][] array1 = myArray.newArray(4, 4, true);
    System.out.println("Сумма элементов: " + myArray.sumOfArrayElements(array1) + "\n");

    String[][] array2 = myArray.newArray(4, 4, false);
    System.out.println("Сумма элементов: " + myArray.sumOfArrayElements(array2) + "\n");

    String[][] array3 = myArray.newArray(5, 4, true);
    System.out.println("Сумма элементов: " + myArray.sumOfArrayElements(array3) + "\n");

    String[][] array4 = myArray.newArray(4, 5, true);
    System.out.println("Сумма элементов: " + myArray.sumOfArrayElements(array4) + "\n");

    String[][] array5 = myArray.newArray(3, 4, true);
    System.out.println("Сумма элементов: " + myArray.sumOfArrayElements(array5) + "\n");

    String[][] array6 = myArray.newArray(4, 3, true);
    System.out.println("Сумма элементов: " + myArray.sumOfArrayElements(array6) + "\n");
  }
}
