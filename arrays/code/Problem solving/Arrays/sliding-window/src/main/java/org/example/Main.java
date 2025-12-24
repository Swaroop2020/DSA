package org.example;

import org.example.hard.SlidingWindowMax;
import org.example.service.KadanesAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SlidingWindowMax swm = new SlidingWindowMax();
        KadanesAlgorithm kadanes = new KadanesAlgorithm();

        System.out.println("----------- Sliding Window Max -------------");
        int[] array = new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(swm.calculate(array,3)));
        System.out.println("--------------------------------------------");

        System.out.println("----------- Kadanes Algorithm -------------");
        System.out.println(kadanes.calculate(array));
        System.out.println("--------------------------------------------");
    }
}