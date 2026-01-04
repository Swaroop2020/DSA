package org.example.service.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// Leetcode 438. Find All Anagrams in a String
public class AllAnagramsInAString {

    public List<Integer> calculate(String str, String str2){

        List<Integer> list = new ArrayList<>();

        int n2 = str2.length();
        int n1 = str.length();

        if(n2>n1) return list;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<n1;i++){
            freq1[str.charAt(i)-'a']++;

            /// n2 is the size of small string
            if(i<n2) {
                freq2[str2.charAt(i) - 'a']++;
            }

            ///  slide window is size exceeds
            if(i>=n2){
                int leftIndx = str.charAt(i-n2)-'a';
                freq1[leftIndx]--;
            }

            /// check for match and add the start index.
            if(i>=n2-1){
                if(doesMatch(freq1, freq2)){
                    list.add(i-n2+1);
                }
            }

        }
        return list;
    }

    private boolean doesMatch(int[] freq1, int[] freq2) {
        for(int i=0;i<26;i++){
            if(freq1[i]!= freq2[i]){
                return false;
            }
        }
        return true;
    }
}
