package org.example;

import org.example.structures.FenwickTree;
import org.example.structures.FenwickTree2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{7,3,5,2,-4,6,-8};

        FenwickTree fenwick = new FenwickTree(array);
        System.out.println(fenwick);

        int i=3;
        int value = 4;
        fenwick.update(i+1,value - array[i]);
        array[i] = value;
        System.out.println(fenwick);


        array = new int[]{5,6,1,1,2,3,4,3,6,1};

        FenwickTree2 tree = new FenwickTree2(array);
        System.out.println(tree);

    }
}