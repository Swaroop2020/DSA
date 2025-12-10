package org.example.service;

public class PrefixSum {

    public int[] calculatePrefixSum(int[] array){
        int[] result = new int[array.length];
        result[0] = array[0];
        for(int i=1;i<array.length;i++){
            result[i] = result[i-1] + array[i];
        }
        return result;
    }
}
