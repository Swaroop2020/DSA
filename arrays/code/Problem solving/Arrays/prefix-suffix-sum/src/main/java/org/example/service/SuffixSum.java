package org.example.service;

public class SuffixSum {

    public int[] calculateSuffixSum(int[] array){
        int[] result = new int[array.length];
        result[result.length-1] = array[array.length-1];
        for(int i= array.length-2; i>=0; i--){
            result[i] = array[i]+result[i+1];
        }
        return result;
    }
}
