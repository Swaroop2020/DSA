package org.example.easy;

import java.util.Arrays;

/// Leetcode : 14
/// KMP is an overkill for this problem as there is no need for jumping when there is a mismatch
public class LongestCommonPrefix {

    public String calculate(String[] strs){

        if(strs == null || strs.length==0){
            return "";
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        int minLen = Math.min(first.length(), last.length());
        for(int i=0; i<minLen; i++){
            if(first.charAt(i) != last.charAt(i)) {
                return first.substring(0,i);
            }
        }
        // If we reach here, the entire 'first' string is the prefix!
        return first;
    }

    /// This doesn't have sorting overhead and has better time complexity.
    public String betterCalculate(String[] strs){
        if(strs == null || strs.length==0){
            return "";
        }
        String first = strs[0];
        for(int i=0 ; i<first.length();i++){
            for(int j=1; j< strs.length; j++){
                if(strs[j].length()<i+1 || strs[j].charAt(i)!=first.charAt(i)){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }

}