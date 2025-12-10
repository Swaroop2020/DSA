package org.example.service;

import java.util.HashMap;

public class MinSubArrayWithGivenSum {

    /// doesn't work with arrays of negative integers
    public int calculate(int[] array, int k){
        int start=0,sum =0, minLen=array.length+1;
        for(int i=0;i<array.length;i++){
            sum+=array[i];

            while(sum>k){
                sum-=array[start];
                start++;
            }

            if(sum==k)
                minLen = Math.min(minLen, i-start+1);

        }
        return (minLen > array.length) ? 0 : minLen;
    }

    public int betterCalculate(int[] array, int k){

        if(k==0 && array!=null){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefixSum =0;
        int minLength=array.length+1;

        for(int i=0;i<array.length;i++){
            prefixSum+=array[i];
            int req = prefixSum -k;
            if(map.containsKey(req)){
                minLength = Math.min(minLength, i-map.get(req));
            }

            map.put(prefixSum,i);
        }
        return minLength>array.length?0:minLength;
    }
}
