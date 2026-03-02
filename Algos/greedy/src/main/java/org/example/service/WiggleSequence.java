package org.example.service;

/// Leetcode : 376

public class WiggleSequence {
    public int wiggleMaxLength(int[] nums) {
        int up = 1;
        int down =1;

        /// we want [up , down, up, down, up, down]
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
                up = down +1;
            if(nums[i]<nums[i-1])
                down = up+1;
        }
        return Math.max(up,down);
    }
}
