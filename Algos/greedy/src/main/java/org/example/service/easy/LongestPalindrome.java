package org.example.service.easy;

/// Leetcode : 409
public class LongestPalindrome {

    /// Time Complexity : O(n)
    /// Space Complexity : O(1)
    public int CalculateLongestPalindrome(String s) {
        int[] freq = new int[128];
        for(char c : s.toCharArray()){
            freq[c]++;
        }

        int length=0;
        boolean hasOdd = false;
        for(int count: freq){
            if(count%2==0){
                length+=count;
            }else{
                length += count-1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            length++;
        }
        return length;
    }

}
