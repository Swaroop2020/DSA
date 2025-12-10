package org.example.service;

public class EquillibriumSum {

    public int pivotIndex(int[] array){
        int[] preSum = new int[array.length];
        preSum[0] = array[0];
        for(int i =1; i< array.length; i++){
            preSum[i] = preSum[i-1]+array[i];
        }
        int n = preSum[preSum.length-1];
        for(int i=0; i< array.length;i++){
            int left = i==0? 0 : preSum[i-1];
            int right = n-preSum[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}
