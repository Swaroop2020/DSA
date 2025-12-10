package org.example.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/// Input : [1,2,2] -> Output = 1 -> [1,2,3]
/// Input : [3,2,1,2,1,7] -> Output = 6 -> [3,2,1,4,5,7]
public class MinCostToMakeArrayUnique {

    public int calculate(int[] array){
        Set<Integer> set = new HashSet<Integer>();
        if(array.length==0)
            return 0;
        int cost = 0;
        for(int i=0; i<array.length;i++){
            int k = array[i];
            while(!set.add(k)){
                k++;
                cost++;
            }
        }
        return cost;
    }

    public int betterCalculate(int[] array){
         Arrays.sort(array);
         int cost = 0;
         for(int i=1;i<array.length;i++){
             if(array[i]<= array[i-1]){
                 cost+= array[i-1] -array[i] +1;
                 array[i] = array[i-1] + 1;
             }
         }
         return cost;
    }
}
