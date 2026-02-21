package org.example.service;

/// Leetcode: 55
public class JumpGame {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int target = length-1;
        for(int i=length-2;i>=0;i--){
            if(nums[i]+i>=target){
                target = i;
            }
        }
        if(target==0){
            return true;
        }
        return false;
    }
}
