package org.example.service.medium;

/// Leetcode : 376
public class WiggleSequence {

    /// Time Complexity: O(n), parsed once
    /// Space complexity: O(1)
    public int wiggleMaxLength(int[] nums) {
        int up = 1;
        int down =1;

        /// we want [up , down, up, down, up, down]
        /// Time Complexity : O(n)
        /// Space Complexity : O(1)
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1])
                up = down +1;
            if(nums[i]<nums[i-1])
                down = up+1;
        }
        return Math.max(up,down);
    }
}
