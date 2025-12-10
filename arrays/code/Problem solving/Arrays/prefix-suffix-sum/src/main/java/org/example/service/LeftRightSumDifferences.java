package org.example.service;

public class LeftRightSumDifferences {

    public int[] calculate(int[] array){
        int rightSum = 0;
        for(int i=0;i< array.length;i++){
            rightSum+=array[i];
        }
         int leftSum = 0;
        for(int i=0;i< array.length;i++){
            int val = array[i];

            rightSum-=val;
            array[i] = Math.abs(leftSum - rightSum);
            leftSum+=val;
        }
        return array;
    }
}
