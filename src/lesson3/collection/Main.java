package lesson3.collection;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    //FirstTask
    FirstTask firstTask = new FirstTask();

    HashMap<Object, String> map = new HashMap<Object, String>();
    map.put(1, "Прохор1");
    map.put(2, "Прохор0");
    map.put(3, "Прохор1");
    map.put(4, "Прохор2");
    map.put(5, "Прохор1");
    map.put(6, "Прохор2");
    map.put(7, "Прохор2");
    map.put(8, "Прохор2");
    map.put(9, "Прохор2");
    map.put(10, "Прохор1");
    map.put(11, "Прохор1");
    map.put(12, "Прохор3");
    map.put(13, "Прохор4");
    map.put(14, "Прохор5");
    map.put(15, "Прохор1");
    map.put(16, "Прохор2");
    map.put(17, "Прохор6");
    map.put(18, "Прохор6");
    map.put(19, "Прохор6");
    map.put(20, "Прохор6");

    firstTask.printUniqueStrings(map);
    firstTask.printStringsCount(map);
  }
}
