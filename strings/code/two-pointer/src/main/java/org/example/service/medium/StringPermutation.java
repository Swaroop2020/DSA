package org.example.service.medium;

/// 567. Permutation in String
public class StringPermutation {

    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        // Edge Case: Check for null or if s1 is longer than s2
        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }

        // Edge Case: If s1 is empty, an empty string is technically
        // a permutation present in any string.
        if (s1.isEmpty()) {
            return true;
        }

        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];

        // Initialize the frequency counts for the first window
        for (int i = 0; i < n1; i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            s2Counts[s2.charAt(i) - 'a']++;
        }

        // Slide the window across s2
        for (int i = 0; i < n2 - n1; i++) {
            if (isMatch(s1Counts, s2Counts)) return true;

            // Update window: remove left char, add right char
            s2Counts[s2.charAt(i) - 'a']--;
            s2Counts[s2.charAt(i + n1) - 'a']++;
        }

        // Check the very last window
        return isMatch(s1Counts, s2Counts);
    }

    private boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

}