package org.example.service;

public class Palindrome {

    public boolean isPalindrome(String str){
        int i=0;
        int j = str.length()-1;

        /// this creates a new string as String is immutable
        //str.toLowerCase();

        while(i<j){
            while(i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }

            while(i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j))){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public boolean betterCalculate(String str){
        int i=0;
        int j = str.length()-1;

        /// this creates a new string as String is immutable
        //str.toLowerCase();

        while(i<j){
            while(i<j && !isAlphaNumeric(str.charAt(i))){
                i++;
            }

            while(i<j && !isAlphaNumeric(str.charAt(j))){
                j--;
            }

            if(toLower(str.charAt(i))!=toLower(str.charAt(j))){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    private boolean isAlphaNumeric(char c){
        return (c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9');
    }

    private char toLower(char c){
        if(c>='A' && c<= 'Z'){
            return  (char)(c+32);
        }
        return c;
    }
}
