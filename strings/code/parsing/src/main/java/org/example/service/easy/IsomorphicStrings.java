package org.example.service.easy;

/// Leetcode 205
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] lastS = new int[256];
        int[] lastT = new int[256];

        for(int i=0;i<s.length();i++){
            if(lastS[s.charAt(i)]!= lastT[t.charAt(i)]) return false;

            lastS[s.charAt(i)] = i+1;
            lastT[t.charAt(i)] = i+1;
        }
        return true;
    }
}

