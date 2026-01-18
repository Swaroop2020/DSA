package org.example.service.medium;

/// HackerRank Repeated String
/// /// repetitions of 'a' in an infinitely repeated string
/// By Nikhil Lohia
public class RepeatedString {

    public long calculate(String s, long n) {
        if (s == null || s.isEmpty() || n <= 0) return 0;

        int len = s.length();
        long totalRepetitions = n / len;
        long remainder = n % len;

        long aCountInPattern = 0;
        long extraACount = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                aCountInPattern++;
                // Check if this 'a' falls within the leftover part of the string
                if (i < remainder) {
                    extraACount++;
                }
            }
        }

        return (totalRepetitions * aCountInPattern) + extraACount;
    }
}
