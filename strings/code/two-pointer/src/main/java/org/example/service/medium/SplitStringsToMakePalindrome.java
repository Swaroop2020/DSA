package org.example.service.medium;

///  1616. Split Two Strings to Make Palindrome
public class SplitStringsToMakePalindrome {

    public boolean checkPalindromeFormation(String a, String b) {
        // We check both directions: a_prefix + b_suffix OR b_prefix + a_suffix
        return check(a, b) || check(b, a);
    }

    private boolean check(String a, String b) {
        int left = 0;
        int right = a.length() - 1;

        // 1. Move pointers as long as outer characters match
        while (left < right && a.charAt(left) == b.charAt(right)) {
            left++;
            right--;
        }

        // 2. Once they don't match, check if the "gap" in either a or b is a palindrome
        return isPalindrome(a, left, right) || isPalindrome(b, left, right);
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

