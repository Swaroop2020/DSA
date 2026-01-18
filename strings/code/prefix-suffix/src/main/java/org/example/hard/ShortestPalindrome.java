package org.example.hard;

import static org.example.medium.RepeatedStringMatch.getLPS;

/// Leetcode 214
public class ShortestPalindrome {

    public String shortestPalindrome(String s){

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s+"#"+ rev;
        int[] lps = getLPS(combined);

        int longestPalPrefix = lps[lps.length-1];

        String suffix = s.substring(longestPalPrefix);
        String prefixToAdd = new StringBuilder(suffix).reverse().toString();

        return prefixToAdd+s;
    }

    public static int[] getLPS(String s){
        int[] lps = new int[s.length()];
        int i=1, len=0;

        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
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
