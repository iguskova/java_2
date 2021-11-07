package ru.solvo;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {

        Map<Integer, String> camp = new HashMap<>();
        camp.put(2100, "Fire");
        camp.put(1612, "Water");
        camp.put(1647, "Wind");
        camp.put(1249, "Earth");

        System.out.println(camp);

        System.out.println(camp.size());

        for (Map.Entry<Integer, String> item : camp.entrySet()) {
            System.out.println("Server: " + item.getKey() + " Camp: "
                    + item.getValue());
        }

        camp.clear();
    }
}
