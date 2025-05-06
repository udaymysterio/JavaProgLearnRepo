package ArrayPackage;

import java.util.ArrayList;

public class ArrayStartLast {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("ElderBerry");

        String firstElement = arrayList.getFirst();
        String lastElement = arrayList.getLast();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}
