package org.example.structures.maps;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(5, "Alpha");
        treeMap.put(3,"Cobal");
        treeMap.put(1, "Beta");

        System.out.println(treeMap);

        TreeMap<String, Integer> treeMap2 = new TreeMap<>();

        treeMap2.put("Alpha", 5);
        treeMap2.put("Cobal", 3);
        treeMap2.put("Beta", 1);

        System.out.println(treeMap2);
    }

}
