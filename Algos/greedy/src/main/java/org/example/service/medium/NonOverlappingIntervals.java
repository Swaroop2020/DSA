package org.example.service.medium;

import java.util.Arrays;

/// Leetcode : 435
public class NonOverlappingIntervals {

    /// Time Complexity : O(nlogn), for sorting
    /// space Complexity : O(logn), this would be space used for recursion stack, in quick/merge sort.
    public int eraseOverlapIntervals(int[][] intervals) {
        int removals = 0;
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        int previous = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<previous){
                removals++;
            }else{
                previous = intervals[i][1];
            }
        }
        return removals;
    }
}
