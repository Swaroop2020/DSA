package org.example.service.hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/// Leetcode : 502
public class IPO {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        int n = capital.length;
        int[][] investments = new int[n][2];

        for(int i=0;i<n;i++){
            investments[i][0] = profits[i];
            investments[i][1] = capital[i];
        }

        Arrays.sort(investments, (a, b)-> Integer.compare(a[1], b[1]));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;

        while(k>0){
            while(i<n && investments[i][1]<=w){
                maxHeap.offer(investments[i][0]);
                i++;
            }

            if(maxHeap.isEmpty()){
                return w;
            }

            w += maxHeap.poll();
            k--;

        }
        return w;
    }

}
