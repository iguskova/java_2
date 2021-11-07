package ru.solvo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();
        fruits.add("pear");
        fruits.add("mango");
        fruits.add("passion fruit");
        fruits.add("kiwi");

        System.out.println(fruits.size());

        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }

        TreeSet<String> listSorted = new TreeSet<>();
        listSorted.addAll(fruits);

        for (String elCollection : listSorted) {
            System.out.println(elCollection);
        }
    }
}
