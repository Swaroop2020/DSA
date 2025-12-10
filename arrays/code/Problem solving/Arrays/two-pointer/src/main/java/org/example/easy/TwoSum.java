package org.example.easy;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    /// works only on sorted array
    public int[] calculate(int[] array, int k){
        int l=0;
        int r= array.length-1;
        while(l<r){
            int sum = array[l]+array[r];
            if(sum == k){
                return new int[]{l,r};
            }else if(sum>k)
                r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
    /// returns values
    public int[] calculateForUnsorted(int[] array, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int num: array){
            int complement = k-num;
            if(set.contains(complement)){
                return new int[]{complement, num};
            }
            set.add(num);
        }
        return new int[]{-1,-1};
    }


    /// returns indexes
    public int[] calculateWitoutHashset(int[] array, int k){
        int[][] pairs = new int[array.length][2];
        for(int i=0;i<array.length;i++){
            pairs[i][0] = array[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a,b)->a[0]-b[0]);

        int l=0;
        int r = pairs.length-1;
        while(l<r){
            int sum = pairs[l][0]+pairs[r][0];
            if(sum==k){
                return new int[]{pairs[l][1], pairs[r][1]};
            }else if(sum>k)
                r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}
