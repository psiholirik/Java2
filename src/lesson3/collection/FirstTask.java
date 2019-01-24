package lesson3.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstTask {

  private int findDuplicate(HashMap<Object,String> map, String word) {
    int count = 0;
    for (Map.Entry<Object, String > entry1 : map.entrySet()) {
      if (entry1.getValue().equals(word)) {
        count++;
      }
    }
    return count;
  }

  void printUniqueStrings(HashMap<Object, String> map) {
    for (Map.Entry<Object, String > entry : map.entrySet()) {
        String word = entry.getValue();
      if (findDuplicate(map, word) == 1) {
        System.out.println(word);
      }
    }
  }

  void printStringsCount(HashMap<Object, String > map) {
    Iterator<String> iterator = map.values().iterator();
    while (iterator.hasNext()) {
      String word = iterator.next();
      int count = findDuplicate(map, word);
      System.out.println("Слово " + word + " встретилось " + count + " раз");
      removeValues(iterator, word);
    }
  }

  private void removeValues(Iterator<String> iterator, String word) {
    while (iterator.hasNext()) {
      if(iterator.next().equals(word)) {
        iterator.remove();
      }
    }
  }
}
