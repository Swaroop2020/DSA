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
    public String betterCalculate(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (n2 > n1) return "";

        int[] freqTarget = new int[128];
        int[] freqWindow = new int[128];

        int required = 0;
        for (char c : str2.toCharArray()) {
            if (freqTarget[c] == 0) required++; // Count unique characters needed
            freqTarget[c]++;
        }

        int minLen = n1 + 1;
        int left = 0, right = 0, formed = 0, start = 0;

        while (right < n1) {
            char c = str1.charAt(right);
            freqWindow[c]++;

            // Only increment formed if we've met the EXACT count for a specific character
            if (freqTarget[c] > 0 && freqWindow[c] == freqTarget[c]) {
                formed++;
            }

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = str1.charAt(left);
                freqWindow[leftChar]--;

                // FIX: Only decrement formed if this char was required
                // AND we now have less than the required amount.
                if (freqTarget[leftChar] > 0 && freqWindow[leftChar] < freqTarget[leftChar]) {
                    formed--;
                }
                left++;
            }
            right++;
        }

        return minLen == n1 + 1 ? "" : str1.substring(start, start + minLen);
    }
}
