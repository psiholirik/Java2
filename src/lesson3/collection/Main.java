package lesson3.collection;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //FirstTask
    FirstTask firstTask = new FirstTask();

    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Прохор1");
    arrayList.add("Прохор2");
    arrayList.add("Прохор1");
    arrayList.add("Прохор1");
    arrayList.add("Прохор4");
    arrayList.add("Прохор1");
    arrayList.add("Прохор4");
    arrayList.add("Прохор1");
    arrayList.add("Прохор1");
    arrayList.add("Прохор5");
    arrayList.add("Прохор1");
    arrayList.add("Прохор1");
    arrayList.add("Прохор7");
    arrayList.add("Прохор6");
    arrayList.add("Прохор1");
    arrayList.add("Прохор1");
    arrayList.add("Прохор6");
    arrayList.add("Прохор1");
    arrayList.add("Прохор8");
    arrayList.add("Прохор1");

    firstTask.printUniqueStrings(arrayList);
    firstTask.printStringsCount(arrayList);
  }
}
