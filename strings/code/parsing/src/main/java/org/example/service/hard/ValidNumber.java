package org.example.service.hard;

/// Leetcode 65
public class ValidNumber {

    public boolean isValidNumber(String s){

        if(s==null || s.isEmpty()) return false;

        int length = s.length();
        int index = 0;

        // Check for optional sign at the beginning
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            index++;
        }

        // If string ends after sign, it's invalid
        if (index == length) {
            return false;
        }

        // Check for invalid decimal point cases:
        // - Decimal point at the end of string
        // - Decimal point immediately followed by 'e' or 'E'
        if (s.charAt(index) == '.' &&
                (index + 1 == length || s.charAt(index + 1) == 'e' || s.charAt(index + 1) == 'E')) {
            return false;
        }

        // Track occurrences of decimal point and exponent
        int decimalCount = 0;
        int exponentCount = 0;

        // Iterate through the remaining characters
        for (int currentIndex = index; currentIndex < length; currentIndex++) {
            char currentChar = s.charAt(currentIndex);

            if (currentChar == '.') {
                // Decimal point is invalid after exponent or if there's already a decimal
                if (exponentCount > 0 || decimalCount > 0) {
                    return false;
                }
                decimalCount++;
            } else if (currentChar == 'e' || currentChar == 'E') {
                // Exponent is invalid if:
                // - There's already an exponent
                // - It's at the beginning (right after sign)
                // - It's at the end of string
                if (exponentCount > 0 || currentIndex == index || currentIndex == length - 1) {
                    return false;
                }
                exponentCount++;

                // Check for optional sign after exponent
                if (s.charAt(currentIndex + 1) == '+' || s.charAt(currentIndex + 1) == '-') {
                    currentIndex++;
                    // If sign is the last character, it's invalid
                    if (currentIndex == length - 1) {
                        return false;
                    }
                }
            } else if (currentChar < '0' || currentChar > '9') {
                // Any non-digit character (except handled cases) is invalid
                return false;
            }
        }

        return true;
    }

}
