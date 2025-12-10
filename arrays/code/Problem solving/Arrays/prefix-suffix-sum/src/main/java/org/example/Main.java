package org.example;

import org.example.service.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        PrefixSum prefixSum = new PrefixSum();
        SuffixSum suffixSum = new SuffixSum();
        EquillibriumSum equillibriumSum = new EquillibriumSum();
        RangeSum rangeSum = new RangeSum();
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        SubArray_Sum_Equals_K subArraySumEqualsK = new SubArray_Sum_Equals_K();
        Max_Sum_SubArray maxSumSubArray = new Max_Sum_SubArray();
        Count_SubArrays_on_Sum countSubArraysOnSum = new Count_SubArrays_on_Sum();
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        RightSideSum rightSideSum = new RightSideSum();
        LeftRightSumDifferences leftRightSumDifferences = new LeftRightSumDifferences();

        //Hard category
        NextGreaterElement nextGreaterElement = new NextGreaterElement();



        int[] array = new int[]{2, 5, 1, 3, 4};
        int[] range = prefixSum.calculatePrefixSum(array);

        System.out.println("Prefix sum : "+ Arrays.toString(range));

        int[] sufSum = suffixSum.calculateSuffixSum(array);
        System.out.println("suffix sum : "+Arrays.toString(sufSum));

        int[] arrayForEquillibrium = new int[]{1,7,3,6,5,6};
        System.out.println("pivot index for equillibrium is : "+equillibriumSum.pivotIndex(arrayForEquillibrium));

        System.out.println("range sum of 1 & 3 in array :"+Arrays.toString(array)+" is : "+rangeSum.calculate(array,1,3));

        array = new int[]{1,2,3,4,5};
        System.out.println("product except self is : "+Arrays.toString(productExceptSelf.calculate(array)));

        array = new int[]{2,3,-5,5,-5,1,4};
        System.out.println("count of sub arrays : "+subArraySumEqualsK.countSubArrays(array,5));

        array = new int[]{-2, -5, 6, -2, -3, 1, 5, -6};
        System.out.println("max Sum sub array is : "+maxSumSubArray.maxSum(array));

        System.out.println("max sum subarray is : "+maxSumSubArray.maxSumWitIndeces(array));

        array = new int[]{1,2,3};
        System.out.println("count of subarrays with sum 3 is : "+countSubArraysOnSum.calculate(array,3));

        array = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(" \n max water can be contained is : "+containerWithMostWater.calculate(array));

        array = new int[]{3,4,2,1};
        System.out.println(" \n Right sum of array is : "+Arrays.toString(rightSideSum.calculate(array)));

        array = new int[]{5,8,2,3,6};
        System.out.println(" \n Left Right Sum differences is : "+Arrays.toString(leftRightSumDifferences.calculate(array)));

        array = new int[]{1,3,4,1,2};
        System.out.println("\n Next Greater elements is : "+Arrays.toString(nextGreaterElement.calculate(array)));

    }

}