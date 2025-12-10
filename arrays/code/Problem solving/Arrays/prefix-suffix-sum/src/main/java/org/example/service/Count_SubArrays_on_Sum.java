package org.example.service;

import java.util.HashMap;
import java.util.Map;

public class Count_SubArrays_on_Sum {

    public int calculate(int[] array, int k){
        int[] prefixSum = new int[array.length];

        for(int i=0;i< array.length;i++){
            prefixSum[i] = i==0? array[i]: array[i]+prefixSum[i-1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        for(int i=0;i<prefixSum.length;i++){
            int wanted = prefixSum[i]-k;
            if(map.containsKey(wanted))
                count+=map.get(wanted);
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i],0)+1 );
        }
        return count;
    }
}
