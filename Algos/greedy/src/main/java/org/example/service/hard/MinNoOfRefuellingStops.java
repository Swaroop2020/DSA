package org.example.service.hard;

import java.util.Collections;
import java.util.PriorityQueue;

///  Leetcode : 871
public class MinNoOfRefuellingStops {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());

        int stops = 0;
        int currentFuel = startFuel;
        int n = stations.length;
        int i=0;

        while(currentFuel<target){
            while(i<n && stations[i][0]<=currentFuel){
                que.offer(stations[i][1]);
                i++;
            }

            if(que.isEmpty()){
                return -1;
            }

            stops++;
            currentFuel+=que.poll();

        }
        return stops;
    }

}
