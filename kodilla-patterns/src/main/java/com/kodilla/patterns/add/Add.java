package com.kodilla.patterns.add;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Add {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Jan");
        list.add("Marek");
        list.add("Karol");
        list.add("Jan");
        list.add("Marek");
        list.add("Jan");

        HashMap<String, Integer> words = new HashMap<>();

        for (String element : list) {
            if (!words.containsKey(element)) {
                words.put(element, 1);
            } else {
                Integer integer = words.get(element);
                words.put(element, integer + 1);
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (HashMap.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
