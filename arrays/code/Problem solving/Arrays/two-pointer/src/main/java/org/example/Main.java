package org.example;

import org.example.easy.*;
import org.example.hard.MinWindowSubString;
import org.example.hard.RainWaterTrap;
import org.example.hard.RainWaterTrapped;
import org.example.medium.ContainerWithMostWater;
import org.example.medium.ThreeSum;

import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RainWaterTrap rainWaterTrap = new RainWaterTrap();
        TwoSum twoSum = new TwoSum();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        MoveZerosAndNegatives mzan = new MoveZerosAndNegatives();
        DutchNationalFlag dutchNational = new DutchNationalFlag();
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        RainWaterTrapped rainWaterTrapped = new RainWaterTrapped();
        LongestSubStringWNRChars lsswnrc = new LongestSubStringWNRChars();
        MinWindowSubString mwss = new MinWindowSubString();

        ThreeSum threesum = new ThreeSum();

        int[] array = new int[]{0,1,0,2,1,0,1,3,2,1,2,1,2};
        int[] arr = new int[]{3,0,3};

        ///  arr is a special case for RainWater trap which fails for while(l<r)
        ///  need to use while(l<=r) always
        System.out.println("------------ Rain Water Trapped ------------");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Total Water Trapped : " + rainWaterTrapped.calculate(array) + " units");
        System.out.println("Approach 2 : "+rainWaterTrapped.calculate2(array)+" units");

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
        dutchNational.calculate(array);
        System.out.println(Arrays.toString(array));
        /// special case.
        array = new int[]{1,0};
        dutchNational.calculate(array);
        System.out.println(Arrays.toString(array));


        System.out.println("------------ Move zeros and negatives  ---------------");
        array = new int[]{3,2,-1,0,4,3};
        mzan.move(array);
        System.out.println(Arrays.toString(array));

        System.out.println("------------ Three Sum ---------------");
        array = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threesum.calculate(array,0));
        System.out.println(threesum.betterCalculate(array,0));

        System.out.println("------------ Container With More Water ---------------");
        array = new int[]{3,5,4,2,5};
        int result = cwmw.calculate(array);
        System.out.println("result : "+result);

        System.out.println("------------ Longest SubString with non repeating characters ---------------");
        System.out.println("Approach 1: "+lsswnrc.calculate("wke"));
        System.out.println("Better Approach : "+lsswnrc.betterCalculate("wke"));
        System.out.println("----------------------------------------------------------------------------");


        System.out.println("--------------  MinWindowSubString  -----------------------");
        System.out.println(mwss.betterCalculate("ADOBECODEBANC", "ABC"));
        System.out.println("-----------------------------------------------------------");

    }
}