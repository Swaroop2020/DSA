package org.example.service;


/// Leetcode : 45
public class JumpGame2 {
    public int jump(int[] nums){
        int jumps=0;
        int farthest =0;
        int currentEnd = 0;
        for(int i=0;i<nums.length-1;i++){
            farthest = Math.max(farthest, nums[i]+i);
            if(i==currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
