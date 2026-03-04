package org.example.service.easy;

/// Leetcode 121
public class BestTimeToBuySellStock {

    /// Time Complexity : O(n) linear scan
    /// space Complexity : O(1) constant space
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i=0; i<prices.length;i++){
            min = Math.min(prices[i], min);
            maxProfit = Math.max(prices[i]-min, maxProfit);
        }
        return maxProfit;
    }
}
