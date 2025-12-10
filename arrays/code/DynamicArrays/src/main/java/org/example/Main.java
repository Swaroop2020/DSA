package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List list = new ArrayList<Integer>();

        list.add(12);// adds at the end
        list.add(19);
        list.add(0,15); // adds at index 0

        list.set(1,9); // sets at index 1

        System.out.println(list.get(2)); // gets element at index 2
        System.out.println(list);
        list.remove(2); //removes at index 2

        System.out.println(list.size());
        list.clear();
        System.out.println(list);

    }
}