package org.example.service.medium;

import java.util.Arrays;

/// Leetcode 3557
public class MaxNumberOfNonIntersectingSubStrings {
    public int maxSubstrings(String s) {
        int[] first = new int[26];
        Arrays.fill(first, -1);
        int count = 0;

        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            if(first[idx] !=-1 && i-first[idx]+1>=4){
                count++;
                for(int j=0;j<26;j++){
                    first[j] = -1;
                }
            }else{
                if(first[idx]==-1) first[idx] = i;
            }
        }
        return count;

    }
}
