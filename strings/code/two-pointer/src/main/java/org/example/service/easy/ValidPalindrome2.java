package org.example.service.easy;

/// 680. Valid Palindrome II
public class ValidPalindrome2 {

    public boolean isPalindrome(String str){
        int i=0, j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return isActualPalindrome(str, i+1,j) || isActualPalindrome(str, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isActualPalindrome(String str, int i, int j) {
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
