package org.example.easy;

import java.util.HashMap;

public class RemoveDuplicates {

    /// works only for sorted
    public int[] calculate(int[] array){
        int i=0;
        for(int j=1;j<array.length;j++){
            if(array[j]!=array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        i++;
        while(i<array.length) {
            array[i] = 0;
            i++;
        }

        return array;
    }

    /// works for unsorted
    public int[] betterCalculate(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        int id=0;
        for(int num : array){
            if(!map.containsKey(num)){
                map.put(num,id++);
            }
        }
        int[] freq = new int[id];
        int i=0;
        for(int j=0;j<array.length;j++){
            int current = array[j];
            freq[map.get(current)]++;
            if(freq[map.get(current)]==1){
                array[i++] = array[j];
            }
        }
        while(i<array.length){
            array[i] = 0;
            i++;
        }
        return array;
    }
}
