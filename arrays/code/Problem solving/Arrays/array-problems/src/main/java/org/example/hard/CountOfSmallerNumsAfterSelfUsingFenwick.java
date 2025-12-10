package org.example.hard;

import java.util.Arrays;
import java.util.Comparator;

public class CountOfSmallerNumsAfterSelfUsingFenwick {

    int[] bit;
    int n;

    void update(int index, int val){
        while(index <= n){
            bit[index] += val;
            index += (index & -index);
        }
    }

    int query(int i){
        int sum =0;
        while(i>0){
            sum+=bit[i];
            i-=i&-i;
        }
        return sum;
    }


    public int[] countSmaller(int[] nums){

        n=nums.length;
        bit = new int[n+1];
        int[] ans = new int[n];
        int[][] array = new int[n][2];
        for(int i=0;i< n;i++){
            array[i][0] = nums[i];
            array[i][1] = i;
        }

        Arrays.sort(array, Comparator.comparing(a->a[0]));


        for(int[] i : array){
            update(i[1]+1,1);

            ans[i[1]] = query(n) - query(i[1]+1);

        }
        return ans;
    }
}
