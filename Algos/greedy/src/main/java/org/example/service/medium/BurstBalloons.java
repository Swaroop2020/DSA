package org.example.service.medium;

import java.util.Arrays;

/// Leetcode : 452
public class BurstBalloons {

    /// Time Complexity : O(nlogn)
    /// Space Complexity : O(n) // Timsort takes O(n) space, in worst case to store temporary runs.
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        Arrays.sort(points,(x, y)->Integer.compare(x[1],y[1]));
        int arrows =1;
        int arrowPos = points[0][1];

        for(int i=0;i<points.length;i++){
            if(arrowPos<points[i][0]){
                arrowPos = points[i][1];
                arrows++;
            }
        }
        return arrows;
    }
}
