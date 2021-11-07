package ru.solvo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListEx {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Peach");
        stringList.add("Apple");
        stringList.add("Grapes");
        stringList.remove(2);

        System.out.println("Второй элемент массива " + stringList.get(1));

        System.out.println(stringList.size());

        Collections.sort(stringList);
        for (String i : stringList) {
            System.out.println(i);
        }

        Collections.reverse(stringList);
        for (String i : stringList) {
            System.out.println(i);
        }
    }
}
