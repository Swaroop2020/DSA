package org.example.service.medium;

/// Leetcode: 1456. Maximum Number of Vowels in a Substring of Given Length
public class MaxVowelsInSubStringOfSizeK {

    public int getMaxVowels(String str, int k){
        int n = str.length();
        int vowelCount = 0, max =0;
        for(int i=0;i<n;i++){
            if(isVowel(str.charAt(i))){
                vowelCount++;
            }

            if(i>=k){
                if(isVowel(str.charAt(i-k))){
                    vowelCount--;
                }
            }

            max = Math.max(vowelCount, max);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }

}
