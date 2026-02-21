package org.example.service;

import java.util.Arrays;

/// Leetcode : 435
public class NonOverlappingIntervals {
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
