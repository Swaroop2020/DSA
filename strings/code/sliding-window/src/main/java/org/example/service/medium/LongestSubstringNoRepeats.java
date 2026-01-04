package org.example.service.medium;

public class LongestSubstringNoRepeats {

    public int calculate(String str) {
        if (str == null || str.length() == 0) return 0;

        int left = 0;
        int[] freq = new int[256];
        int max = 0;

        for (int right = 0; right < str.length(); right++) {
            int rdx = str.charAt(right);
            freq[rdx]++;

            // Shrink the window if the current character is a duplicate
            while (freq[rdx] > 1) {
                int ldx = str.charAt(left);
                freq[ldx]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
