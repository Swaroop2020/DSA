package org.example.service;

import java.util.Arrays;

public class Max_Sum_SubArray {

    public int maxSum(int[] array){
        int currentSum = array[0];
        int maxSoFar = array[0];

        for(int i=1;i<array.length;i++){
            currentSum = Math.max(array[i], array[i]+currentSum);
            maxSoFar = Math.max(maxSoFar, currentSum);

        }
        return maxSoFar;
    }

    public int maxSumWitIndeces(int[] array){
        int start =0, end=0;
        int tempStart=0;
        int currentSum = array[0];
        int maxSofar = array[0];

        for(int i=0;i<array.length;i++){
            if(array[i] > currentSum+array[i]){
                tempStart=i;
                currentSum = array[i];
            }else{
                currentSum+=array[i];
            }

            if(currentSum>maxSofar){
                start = tempStart;
                maxSofar = currentSum;
                end=i;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(array,start,end+1)));
        return maxSofar;
    }
}
