package org.example.service;

/// used in max sum subarray problem
/// we store the sum of subarrays at each index
public class KadanesAlgorithm {

    public int calculate(int[] nums){
        int maxSumSoFar = nums[0];
        int currentSum = nums[0];
        for(int i=1; i<nums.length;i++){
            currentSum = Math.max(currentSum+nums[i],nums[i]);
            maxSumSoFar = Math.max(currentSum, maxSumSoFar);
        }
        return  maxSumSoFar;
    }

}
