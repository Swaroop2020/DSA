package org.example.service.medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/// Leetcode : 792
public class MatchingSubsequences {

    public int countMatches(String s, String[] words){
        // array of deque
        Deque<String>[] waitingWords = new Deque[26];
        Arrays.setAll(waitingWords, index->new ArrayDeque<>());

        // mapping words with its first character index
        // a-> ["a", "ab", "ade"], b->["bc", "bd"]
        for(String word:words){
            int firstChar = word.charAt(0)-'a';
            waitingWords[firstChar].offer(word);
        }

        int matchingSubsequentCount =0;
        for(char c : s.toCharArray()){
            int indx = c-'a';
            Deque<String> que = waitingWords[indx];
            // important. we dont want newly added words in que to be processed for same index in string s
            int size =  que.size();
            for(int i=0; i< size; i++){
                String currWord = que.pollFirst();
                if(currWord.length()==1){
                    matchingSubsequentCount++;
                }else{
                    String newWord = currWord.substring(1);
                    int newindx = newWord.charAt(0)-'a';
                    waitingWords[newindx].offer(newWord);
                }
            }
        }
        return matchingSubsequentCount;
    }
}
