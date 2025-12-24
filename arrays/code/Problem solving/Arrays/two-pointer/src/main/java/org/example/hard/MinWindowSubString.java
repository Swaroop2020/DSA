package org.example.hard;

import java.util.HashMap;
import java.util.Map;

/// LeetCode 76
public class MinWindowSubString {

    public String calculate(String s, String t){

        if(s.length()<t.length()) return "";

        int minLen = s.length()+1;

        Map<Character, Integer> need = new HashMap<>();

        for(char c: t.toCharArray()){
            need.put(c, need.getOrDefault(c,0)+1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int left =0, right =0, formed =0,start=0, required = need.size();

        while(right<s.length()){

            Character c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);

            if(need.containsKey(c)
                    && need.get(c).intValue()== window.get(c).intValue()){
                formed++;
            }

            while(left<=right && formed == required){
                char l = s.charAt(left);
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    start = left;
                }
                window.put(l, window.getOrDefault(l,0)-1);

                if(need.containsKey(l) && window.get(l).intValue()<need.get(l).intValue()){
                    formed--;
                }
                left++;
            }
            right++;

        }
        return minLen==s.length()+1? "": s.substring(start, start+minLen);

    }

    ///  Here we are using an array for frequencies
    public String betterCalculate(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency arrays for ASCII characters
        int[] need = new int[128];
        int[] window = new int[128];

        // Fill the 'need' array and count unique characters required
        int required = 0;
        for (char c : t.toCharArray()) {
            if (need[c] == 0) required++;
            need[c]++;
        }

        int left = 0, right = 0, formed = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window[c]++;

            // If the current character count matches the required count
            if (need[c] > 0 && window[c] == need[c]) {
                formed++;
            }

            // Try to shrink the window from the left
            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);
                window[l]--;

                // If removing the character makes the window invalid
                if (need[l] > 0 && window[l] < need[l]) {
                    formed--;
                }
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
