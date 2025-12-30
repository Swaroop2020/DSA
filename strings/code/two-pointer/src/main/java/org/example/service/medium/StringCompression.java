package org.example.service.medium;

/// Leetcode :443 - String Compression
public class StringCompression {

    public int compress(char[] chars){
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // 1. Count consecutive occurrences
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // 2. Write the character
            chars[write++] = currentChar;

            // 3. Write the count if it's greater than 1
            if (count > 1) {
                // Convert count to string/char array to handle multi-digit numbers
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
