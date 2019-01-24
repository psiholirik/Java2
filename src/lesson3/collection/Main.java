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

    //SecondTask
    SecondTask secondTask = new SecondTask();
    secondTask.add("Blabla", 12345);
    secondTask.add("Blabla3", 1234561);
    secondTask.add("Blabla1", 1234562);
    secondTask.add("Blabla1", 1234563);
    secondTask.add("Blabla2", 1234564);
    secondTask.add("Blabla4", 1234565);
    secondTask.add("Blabla5", 1234566);
    secondTask.add("Blabla6", 1234567);
    secondTask.add("Blabla7", 1234568);
    secondTask.add("Blabla2", 1234569);
    secondTask.add("Blabla2", 123456124);

    System.out.println(secondTask.get("Blabla"));
    System.out.println(secondTask.get("Blabla1"));
    System.out.println(secondTask.get("Blabla2"));
    System.out.println(secondTask.get("Blabla3"));
    System.out.println(secondTask.get("Blabla4"));
    System.out.println(secondTask.get("Blabla5"));
    System.out.println(secondTask.get("Blabla6"));
    System.out.println(secondTask.get("Blabla7"));
    System.out.println(secondTask.get("Blabla8"));
  }
}
