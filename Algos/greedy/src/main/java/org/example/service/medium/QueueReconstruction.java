package org.example.service.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// Leetcode : 406
public class QueueReconstruction {


    /// Time Complexity: O(n^2), Because,with in for loop, you use List.add(index, val).
    /// if everytime we have to insert at 0, we need to shifte each element right.
    /// Space Complexity : O(n), grows proportional to input size
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> list = new ArrayList<>();

        // Sort by heights, because we want taller people forward which matters for [][1] value of each element
        // If has same height, sort by [][1] value in ascending.
        Arrays.sort(people, (a,b)->{
            return a[0]!=b[0] ? b[0] - a[0] : a[1] - b[1];
        });

        // now keep adding the people to list at [][1] index
        for(int[] i : people){
            list.add(i[1],i);
        }
        return list.toArray(new int[people.length][2]);
    }

}
