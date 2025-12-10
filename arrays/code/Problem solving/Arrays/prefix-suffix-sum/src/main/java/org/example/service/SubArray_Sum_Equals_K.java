package org.example.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArray_Sum_Equals_K {

    public int countSubArrays(int[] array, int k){

        int[] prefixSum = new int[array.length];
        prefixSum[0] = array[0];
        for(int i=1;i<array.length;i++){
            prefixSum[i] =prefixSum[i-1]+array[i];
        }
        System.out.println("prefixSum array is : "+ Arrays.toString(prefixSum));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        for(int i=0;i<array.length;i++){
            int currentSum = prefixSum[i];
            int diff = currentSum-k;
            if(map.containsKey(diff))
                count+= map.get(diff);
            map.put(currentSum, map.getOrDefault(currentSum,0)+1);
        }
        return count;
    }

}
