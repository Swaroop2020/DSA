package org.example.service.medium;

import java.util.HashMap;

/// Leetcode 1100
public class SubStringsOfSizeKWithNoRepeats {


    ///  Better way
    public int betterCalculate(String str, int k){
        if(str == null || str.length()<k || k>26) return 0;

        int[] freq = new int[26];
        int duplicates = 0;
        int count = 0;

        for(int i=0;i<str.length();i++){
            int rightIndx = str.charAt(i) - 'a';
            /// if its added for the second time increase the duplicates count
            if(++freq[rightIndx] == 2) duplicates++;

            if(i>=k){
                /// decrement the freq for out element
                int outIndx = str.charAt(i-k) - 'a';
                if(--freq[outIndx]==1) duplicates--;

            }

            if(i>=k-1 && duplicates==0){
                count++;
            }
        }
        return count;
    }

    /// used Hash Map
    public int calculate(String str, int k){

        if(str == null || str.length()<k) return 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i=0;i<k; i++){
            Character c = str.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }
        int count =0;
        for(int j=k; j<str.length();j++){
            if(freqMap.size()==k){
                count++;
            }
            // Slide Window
            char rightChar = str.charAt(j);
            char leftChar = str.charAt(j-k);
            freqMap.put(rightChar, freqMap.getOrDefault(rightChar,0)+1);
            freqMap.put(leftChar, freqMap.get(leftChar)-1);

            if(freqMap.get(leftChar)==0){
                freqMap.remove(leftChar);
            }
        }

        // check last window
        if(freqMap.size()==k){
            count++;
        }
        return count;

    }
}
