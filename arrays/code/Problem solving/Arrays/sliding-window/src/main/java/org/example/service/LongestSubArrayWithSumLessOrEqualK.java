package org.example.service;

import java.util.Map;
import java.util.TreeMap;

public class LongestSubArrayWithSumLessOrEqualK {

    /// Works only on arrays with positive integers.
    public int calculate(int[] array, int k){
        int left =0, sum =0, maxlen =0;
        for(int right=0;right<array.length;right++){
            sum+=array[right];

            while(sum>k){
                sum-=array[left];;
                left++;
            }

            maxlen = Math.max(maxlen, right-left+1);

        }
        return maxlen;
    }

    ///  works for arrays with -ve integers
    public int betterCalculate(int[] array, int k){

        if (array == null || array.length == 0) return 0;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int prefix = 0;
        map.put(0, -1);
        int maxLen=0;
        for(int i=0 ;i<array.length;i++){
            prefix+=array[i];

            int target = prefix-k;

            Map.Entry<Integer, Integer> entry = map.ceilingEntry(target);
            if(entry!=null){
                maxLen = Math.max(maxLen, i-entry.getValue());
            }

            map.putIfAbsent(prefix,i);
        }
        return maxLen;
    }
}
