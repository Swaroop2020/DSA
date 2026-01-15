package org.example.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/// Leetcode 56
public class MergeIntervals {

    public int[][] merge(int[][] intervals){

        if (intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, Comparator.comparing(a->a[0]));
        int i = 0;

        ArrayList<int[]> result = new ArrayList<>();
        for(int j=1;j<intervals.length;j++){
            if(intervals[j][0]>intervals[i][1]){
                result.add(intervals[i]);
                i=j;
            }else{
                intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
            }
        }
        // add the last pending interval
        result.add(intervals[i]);
        return result.toArray(new int[result.size()][]);
    }

}
