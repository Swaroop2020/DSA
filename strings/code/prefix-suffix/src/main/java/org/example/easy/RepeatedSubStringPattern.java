package org.example.easy;

/// Leetcode 459
public class RepeatedSubStringPattern {

    public boolean calculate(String s){

        if (s == null || s.length() < 2) return false;

        String str = s+s;

        str = str.substring(1,str.length()-1);

        return str.contains(s);
    }

    /// using KMP algorithm
    public boolean bettercalculate(String s){
        int[] lps = getLPSArray(s);
        int longestPrefix = lps[s.length()-1];
        int pattern = lps.length-longestPrefix;

        return longestPrefix > 0 && lps.length%pattern==0;
    }

    private int[] getLPSArray(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int i=1, len=0;
        while(i<n){
            if(s.charAt(i) == s.charAt(len)){
                lps[i] = ++len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] =0;
                    i++;
                 }
            }
        }
        return lps;
    }
}
