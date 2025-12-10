package org.example;

import org.example.easy.RemoveDuplicates;
import org.example.easy.TwoSum;
import org.example.hard.RainWaterTrap;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RainWaterTrap rainWaterTrap = new RainWaterTrap();
        TwoSum twoSum = new TwoSum();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        int[] array = new int[]{0,1,0,2,1,0,1,3,2,1,2,1,2};

        System.out.println("--- Rain Water Trapped ---");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Total Water Trapped : " + rainWaterTrap.calculate(array) + " units");

        array = new int[]{1, 2, 3, 4, 6};
        System.out.println("------------ two sum ---------------");
        System.out.println(Arrays.toString(twoSum.calculate(array,6)));
        System.out.println(Arrays.toString(twoSum.calculateForUnsorted(array,6)));
        System.out.println(Arrays.toString(twoSum.calculateWitoutHashset(array,6)));

        System.out.println("------------ Remove Duplicates ---------------");
        array = new int[]{1,1,2,2,2,3,3,3,4,4,5,6};
        System.out.println(Arrays.toString(removeDuplicates.calculate(array)));
        System.out.println(Arrays.toString(removeDuplicates.betterCalculate(array)));

        System.out.println("------------ Dutch National Flag  ---------------");
        array = new int[]{2,0,2,1,1,0};


    }
}