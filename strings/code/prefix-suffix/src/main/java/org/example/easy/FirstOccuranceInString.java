package org.example.easy;

import org.example.hard.LPSArray;

/// Leetcode : 28
public class FirstOccuranceInString {

    LPSArray lpsArray = new LPSArray();

    public int calculate(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }

        for(int i=0; i<= haystack.length()-needle.length();i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public int betterCalculate(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }

        for(int i=0;i<=haystack.length()-needle.length(); i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i, i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    /// uses KMP
    public int worstCalculate(String haystack, String needle){
        int[] lps = lpsArray.computeLPS(needle);

        int i=0, j=0;

        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                if(j==needle.length()){
                    return i-j;
                }
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return -1;
    }


}
