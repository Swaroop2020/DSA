package org.example.service.medium;

/// Leetcode 424. Longest Repeating Character Replacement
public class LongestRepeatingCharReplacement {

    public int calculate(String s, int k) {
        int[] counts = new int[26];
        int start = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            // Increment count of the current character
            int currentCharIdx = s.charAt(end) - 'A';
            counts[currentCharIdx]++;

            // Update the max frequency seen in the current window
            maxFreq = Math.max(maxFreq, counts[currentCharIdx]);

            // Check if replacements needed (window size - maxFreq) exceed k
            // If so, shrink the window from the left
            while ((end - start + 1) - maxFreq > k) {
                counts[s.charAt(start) - 'A']--;
                start++;
            }

            // Update the global maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
