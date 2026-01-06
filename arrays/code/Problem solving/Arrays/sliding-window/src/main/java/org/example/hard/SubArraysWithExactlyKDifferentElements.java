package org.example.hard;

/// Leetcode 992
public class SubArraysWithExactlyKDifferentElements {

    public int calculate(int[] array, int k){
        return atmost(array, k) - atmost(array, k-1);
    }

    private int atmost(int[] array, int k) {
        int n = array.length;
        int[] freq = new int[n+1];
        int l=0,r=0, count=0, result=0;

        while(r<n){

            // Expand the window
            if(freq[array[r]]++==0) count++;

            // Shrink the window if we have more than k distinct elements
            while(count>k){
                if(--freq[array[l]]==0) count--;
                l++;
            }

            // The number of subarrays ending at 'right' with at most k
            // distinct elements is (right - left + 1)
            result += r-l+1;
            r++;
        }
        return result;
    }

}
