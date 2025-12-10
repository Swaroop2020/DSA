package org.example.service;

public class MaxSumSubarraySizeK {

    public int calculate(int[] array,int k){

        if(k>array.length){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int window = 0;

        for(int i=0;i<k;i++){
            window+=array[i];
        }
        max = window;
        for(int i=k;i<array.length;i++){
            window += array[i]-array[i-k];
            max = Math.max(max,window);
        }
        return max;
    }
}
