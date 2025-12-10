package org.example.service;

import java.util.Map;
import java.util.TreeMap;

public class MinSubArrayWithSumGTE {

    public int calculate(int[] array, int k){

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int prefixSum =0;
        int minLenth = array.length+1;

        map.put(0,-1);
        for(int i=0;i<array.length;i++){
            prefixSum+=array[i];
            int target = prefixSum-k;

            Map.Entry<Integer, Integer> entry = map.floorEntry(target);
            if(entry!=null){
                minLenth = Math.min(minLenth, i-entry.getValue());
            }

            map.put(prefixSum, i);
        }
        return minLenth>array.length? 0:minLenth;
    }
}
