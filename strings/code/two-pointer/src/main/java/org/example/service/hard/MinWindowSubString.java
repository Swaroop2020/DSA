package org.example.service.hard;

import java.util.HashMap;
import java.util.Map;

/// LeetCode 76
public class MinWindowSubString {

    public String calculate(String str1, String str2){

        Map<Character, Integer> need = new HashMap<>();

        if(str2.length()>str1.length()) return "";

        for(int i=0;i<str2.length();i++){
            need.put(str2.charAt(i), need.getOrDefault(str2.charAt(i),0)+1);
        }

        int required = need.size();
        int minLen = str1.length()+1;
        int left = 0, right =0, start=0, formed =0;
        Map<Character, Integer> window = new HashMap<>();
        while(right<str1.length()){
            char c = str1.charAt(right);

            window.put(c, window.getOrDefault(c, 0)+1);

            if(need.containsKey(c) && need.get(c).intValue() == window.get(c).intValue()){
                formed++;
            }

            while(left<=right && required==formed){
                char leftChar = str1.charAt(left);

                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    start = left;
                }

                window.put(leftChar, window.get(leftChar)-1);

                if(need.containsKey(leftChar) && window.get(leftChar)<need.get(leftChar)){
                    formed--;
                }
                left++;
            }
            right++;
        }

        return minLen==str1.length()+1 ? "" : str1.substring(start, start+minLen);
    }

    public String betterCalculate(String str1, String str2){
        int n1 = str1.length();
        int n2 = str2.length();

        // Edge Case
        if(n2>n1) return "";

        int[] freq1 = new int[128];
        int[] freq2 = new int[128];

        int required = 0;
        for(char c: str2.toCharArray()){
            if(freq2[c]==0) required++;
            freq2[c]++;
        }

        int minLen = str1.length()+1;
        int left =0, right=0, formed=0, start =0;
        while(right<n1){
            char c = str1.charAt(right);
            freq1[c]++;

            if(freq2[c]>0 && freq2[c] == freq1[c]){
                formed++;
            }

            while(left<=right && formed==required){
                char leftChar = str1.charAt(left);

                if(minLen>right-left+1){
                    minLen = right-left+1;
                    start= left;
                }

                freq1[leftChar]--;
                if(freq1[leftChar]<freq2[leftChar])
                    formed--;

                left++;
            }
            right++;
        }

        return minLen==str1.length()+1?"":str1.substring(start,start+minLen);
    }

}
