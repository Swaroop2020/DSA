package org.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctElementsInWindow {

    ///  This works for arrays with negative integers as well.
    public ArrayList<Integer> calculate(int[] array, int k){
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<array.length;i++){
            map.put(array[i], map.getOrDefault(array[i],0)+1);

            if(i>=k){
                int outEle = array[i-k];
                map.put(outEle, map.get(outEle)-1);
                if(map.get(outEle)==0) map.remove(outEle);
            }

            if(i>= k-1){
                list.add(map.size());
            }
        }
        return list;
    }

    ///  here we are compression indexes to deal with negative elements
    public ArrayList<Integer> calculateWithOutMap(int[] array, int k){
        ArrayList<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        int id=0;
        for(int num: array){
            if(!map.containsKey(num)){
                map.put(num,id++);
            }
        }

        int[] frequency = new int[id];
        int distinct=0;

        for(int i=0; i< array.length;i++){
            int compressedIndex = map.get(array[i]);
            frequency[compressedIndex]++;
            if(frequency[compressedIndex]==1)
                distinct++;

            if(i>=k){
                int outCompressed = map.get(array[i-k]);
                frequency[outCompressed]--;
                if(frequency[outCompressed]==0)
                    distinct--;
            }
            if(i>= k-1) list.add(distinct);
        }
        return list;
    }


}
