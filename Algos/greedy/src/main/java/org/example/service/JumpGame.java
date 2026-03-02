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

    public boolean canJumpAgain(int[] nums) {
        int farthest = 0;

        for(int i = 0; i < nums.length; i++) {

            if(i > farthest) {
                return false;  // we can't even reach here
            }

            farthest = Math.max(farthest, i + nums[i]);

            if(farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}
