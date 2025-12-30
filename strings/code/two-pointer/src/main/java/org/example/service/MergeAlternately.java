package org.example.service;

public class MergeAlternately {
    public String merge(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;

        // Loop as long as there are characters in either string
        while (i < n1 || i < n2) {
            // Add character from word1 if it exists
            if (i < n1) {
                merged.append(word1.charAt(i));
            }
            // Add character from word2 if it exists
            if (i < n2) {
                merged.append(word2.charAt(i));
            }
            i++;
        }

        return merged.toString();
    }
}