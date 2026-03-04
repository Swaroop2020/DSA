package org.example.service.medium;

/// Leetcode : 134
public class GasStation {

    /// Time Complexity : O(n) -> only one for loop for parsing through
    /// Space Complexity : O(1) -> we use the same variables no matter the input size
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank =0;
        int start =0;
        int total = 0;
        for(int i=0;i< gas.length;i++){
            tank+= gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(tank<0){
                start = i+1;
                tank = 0;
            }
        }
        return total<0 ? -1:start;
    }
}
