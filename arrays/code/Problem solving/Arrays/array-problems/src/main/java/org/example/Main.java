package org.example;

import org.example.easy.CountNumLessThanCurrent;
import org.example.hard.MinCostToMakeArrayEqual;
import org.example.hard.CountOfSmallerNumsAfterSelf;
import org.example.hard.CountOfSmallerNumsAfterSelfUsingFenwick;
import org.example.medium.MinCostToMakeArrayUnique;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){

        /// Medium Difficulty
        MinCostToMakeArrayUnique  mctmau = new MinCostToMakeArrayUnique();

        /// Hard Difficulty
        MinCostToMakeArrayEqual mctmae = new MinCostToMakeArrayEqual();

        /// Easy difficulty
        CountNumLessThanCurrent cnltc = new CountNumLessThanCurrent();

        CountOfSmallerNumsAfterSelf cosnas = new CountOfSmallerNumsAfterSelf();

        CountOfSmallerNumsAfterSelfUsingFenwick cosnasFen = new CountOfSmallerNumsAfterSelfUsingFenwick();


        int[] array = new int[]{3,2,1,2,1,7};
        System.out.println(" \n Min cost to make array unique is : "+mctmau.betterCalculate(array) +" \n ");

        array = new int[]{1,3,5,2};
        int minCost = mctmae.calculate(array, new int[]{2,3,1,14});
        System.out.println(" \n Minimum cost required to make elements equal is : "+minCost);

        array = new int[]{8,1,2,2,3};
        int[] count = cnltc.calculate(array);
        System.out.println(" \n Count of numbers less than current num : "+ Arrays.toString(count));

        array = new int[]{5,2,6,1};
        System.out.println(" \n Count of Smaller nums after self : "+Arrays.toString(cosnas.calculate(array)));

        array = new int[]{5,2,6,1};
        System.out.println("\n Count of smaller after self : "+Arrays.toString(cosnasFen.countSmaller(array)));

    }
}