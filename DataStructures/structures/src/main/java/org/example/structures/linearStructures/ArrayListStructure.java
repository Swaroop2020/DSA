package org.example.structures.linearStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStructure {

    public static void main(String[] args) {
        /// cannot add or remove elements, as it creates fixed size arrayList
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.set(2,6);
        System.out.println(list);

        /// mutable List
        List<Integer> li = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        li.add(11);
        li.remove(2);
        System.out.println(li);

        /// immutable list - read only
        List<Integer> gist = List.of(3,4,5,6,7,8);

        //gist.set(2,5);
        //gist.add(3);
        System.out.println(gist);
    }
}
