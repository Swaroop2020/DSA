package org.example.service.hard;

import java.util.Arrays;
import java.util.PriorityQueue;

///  Leetcode : 1383
public class MaxPerformanceOfATeam {

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] employees = new int[n][2];

        for(int i=0;i<n;i++){
            employees[i][0] = speed[i];
            employees[i][1] = efficiency[i];
        }

        Arrays.sort(employees, (a, b)->Integer.compare(b[1], a[1]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        long maxPerf = 0;
        long totalSpeed = 0;
        for(int[] emp : employees){
            totalSpeed+= emp[0];

            minHeap.offer(emp[0]);

            if(minHeap.size()>k){
                totalSpeed-=minHeap.poll();
            }

            maxPerf = Math.max(totalSpeed*emp[1], maxPerf);
        }

        return (int) (maxPerf%1000000007);
    }

}
