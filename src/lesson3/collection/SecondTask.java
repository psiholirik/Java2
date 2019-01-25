package lesson3.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class SecondTask {
  private HashMap<Integer, String> map = new HashMap<>();

  void add(String surname, int phoneNumber) {
    map.put(phoneNumber, surname);
  }

  HashSet<Integer> get(String surname) {
    HashSet<Integer> set = new HashSet<>();

    for (Map.Entry<Integer, String> entry: map.entrySet()) {
      if (entry.getValue().equals(surname)) {
        set.add(entry.getKey());
      }
    }
    return set;
  }
}
