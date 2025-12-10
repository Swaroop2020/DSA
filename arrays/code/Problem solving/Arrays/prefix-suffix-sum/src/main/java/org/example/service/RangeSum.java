package org.example.service;

public class RangeSum {

    public int calculate(int[] array, int l, int r){

        int[] preSum = new int[array.length];
        preSum[0] = array[0];
        for(int i=1 ; i< preSum.length;i++){
            preSum[i] = preSum[i-1] + array[i];
        }

        if(l==0) return preSum[r];
        return preSum[r] - preSum[l-1];

    }
}
