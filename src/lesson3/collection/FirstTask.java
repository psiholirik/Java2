package lesson3.collection;

import java.util.ArrayList;
import java.util.HashSet;

class FirstTask {

  private int findDuplicate(ArrayList<String> arrayList, String word) {
    int count = 0;
    for (String stringArrayList: arrayList) {
      if (stringArrayList.equals(word)) {
        count++;
      }
    }
    return count;
  }

  void printUniqueStrings(ArrayList<String> arrayList) {
    for (String word: arrayList) {
      if (findDuplicate(arrayList, word) == 1) {
        System.out.println(word);
      }
    }
  }

  void printStringsCount(ArrayList<String> arrayList) {
    HashSet<String> hashSet = new HashSet<String>();
    for (String word: arrayList) {
      if (!hashSet.contains(word)) {
        int count = findDuplicate(arrayList, word);
        System.out.println("Слово " + word + " встретилось " + count + " раз");
        hashSet.add(word);
      }
    }
  }
}
