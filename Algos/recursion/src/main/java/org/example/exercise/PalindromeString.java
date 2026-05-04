package org.example.exercise;

public class PalindromeString {

    public boolean isPalindrome(String str, int i, int j){
        if(i>=j) return true;
        if(str.charAt(i)!=str.charAt(j)) return false;
        return isPalindrome(str, i+1, j-1);
    }

    public boolean isPalindromeIgnoreCaseAndSpace(String str, int i, int j){

        if(i>=j) return true;
        char left = str.charAt(i);
        char right = str.charAt(j);

        if(left ==' '){
            return isPalindromeIgnoreCaseAndSpace(str, i+1, j);
        }

        if(right==' '){
            return isPalindromeIgnoreCaseAndSpace(str, i, j-1);
        }

        if(Character.toLowerCase(left) != Character.toLowerCase(right)){
            return false;
        }

        return isPalindromeIgnoreCaseAndSpace(str, i+1, j-1);
    }
}
