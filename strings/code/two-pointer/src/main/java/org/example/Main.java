package org.example;

import org.example.service.MergeAlternately;
import org.example.service.Palindrome;
import org.example.service.SubSequence;
import org.example.service.easy.ValidPalindrome2;
import org.example.service.hard.MinWindowSubString;
import org.example.service.hard.UniqueCharsOfAllSubStrings;
import org.example.service.medium.SplitStringsToMakePalindrome;
import org.example.service.medium.StringCompression;
import org.example.service.medium.StringPermutation;
import org.example.service.medium.VersionComparision;
import org.example.service.reverse.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ReverseString reverse = new ReverseString();
        Palindrome pali = new Palindrome();
        ReverseWords reverseWords = new ReverseWords();
        ReverseEachWord reverseEachWord = new ReverseEachWord();
        ReverseWordsDelimiterPreserved reverseWordsDelimiterPreserved = new ReverseWordsDelimiterPreserved();
        ReverseSubStringRange reverseSubStringRange = new ReverseSubStringRange();
        ReverseVowels reverseVowels = new ReverseVowels();
        ReverseInChunks reverseInChunks = new ReverseInChunks();
        LeftRotateString leftRotateString = new LeftRotateString();
        RightRotateString rightRotateString = new RightRotateString();
        SubSequence subSequence = new SubSequence();
        MergeAlternately mergeAlternately = new MergeAlternately();
        StringCompression stringCompression = new StringCompression();
        StringPermutation stringPermutation = new StringPermutation();
        VersionComparision versionComparision = new VersionComparision();
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        ValidPalindrome2 validPalindrome2 = new ValidPalindrome2();
        UniqueCharsOfAllSubStrings uniqueCharsOfAllSubStrings = new UniqueCharsOfAllSubStrings();
        SplitStringsToMakePalindrome splitStringsToMakePalindrome = new SplitStringsToMakePalindrome();

        /// Reverse a String
        ///  This doesn't work for emojis
        System.out.println("--------------------------------------------------------- ");
        System.out.println(" Reverse of a String ASTRA is : "+reverse.calculate("ASTRA") +" \n");

        ///  This fails
        System.out.println("Hi 🍕!" + " is reversed to : "+ reverse.calculate("Hi 🍕!") +" \n");

        System.out.println("Hi 🍕!" + " is reversed to : "+ reverse.betterCalculate("Hi 🍕!") +" \n");

        System.out.println("Hi 🍕!" + " is reversed to : "+ reverse.easyPeasy("Hi 🍕!") +" \n");

        System.out.println("--------------------------------------------------------- ");

        System.out.println(" is Palindrome  1a2a1 : "+ pali.isPalindrome("1a2a1"));
        System.out.println("is Palindrome 1a2a1 : "+ pali.betterCalculate("1a2a1"));

        System.out.println("--------------------------------------------------------- ");

        String str = "Happy New Year : 2026";
        System.out.println(" Reverse words for the string "+str+" is : "+reverseWords.calculate(str));
        System.out.println(" Reverse words for the string "+str+" is : "+reverseWords.betterCalculate(str));

        System.out.println("--------------------------------------------------------- ");
        String str2 = new String("        I Love Java    ");
        System.out.println("Reverse Each word of String : "+str2+" : result = "+ reverseEachWord.betterReverse(str2));

        System.out.println("------------------------------------------------------------------------------ ");
        String str3 = "ab,cd ef!";
        System.out.println(" Reversing a String " + str3 + " preserving the delimiter : " + reverseWordsDelimiterPreserved.reverse(str3));
        System.out.println(" Reversing a String "+str3+ " preserving the delimiter : "+reverseWordsDelimiterPreserved.reverse2(str3));;

        System.out.println("------------------------------------------------------------------------------ ");

        String str4 = "abcdefg";
        System.out.println("Reversing range of chars in string : "+str4+" gives the result : "+reverseSubStringRange.reverse(str4, 2, 5));
        System.out.println("------------------------------------------------------------------------------ ");

        String str5 = "leetcode";
        System.out.println(" Reversing only vowels for string "+str5+", result :"+reverseVowels.reverse(str5));
        System.out.println("------------------------------------------------------------------------------ ");

        str5 = "abcdefghijk";
        int k=3;
        System.out.println(" Reversing String "+str5+" in chunks of "+k+" gives : "+reverseInChunks.reverse(str5,k));
        System.out.println("------------------------------------------------------------------------------ ");

        str5 = "abcdefghijk";
        k=3;
        System.out.println(" Left Rotating cyclic array by "+k+" is : "+ leftRotateString.lRotate(str5,k));

        System.out.println("------------------------------------------------------------------------------ ");
        str5 = "abcdefghi";
        k=3;
        System.out.println(" Right rotating string "+str5+ "by "+k+" gives u : "+rightRotateString.rightRotate(str5,k));

        System.out.println("------------------------------------------------------------------------------ ");
        str4 = "ace";
        str5 = "abcde";
        System.out.println(" Is "+str4+" a sub sequence of "+str5+" : "+subSequence.isSubsequence(str5,str4));
        System.out.println("------------------------------------------------------------------------------ ");

        System.out.println("Merging alternately : "+mergeAlternately.merge(str4, str5));
        System.out.println("------------------------------------------------------------------------------ ");

        char[] array = new char[]{'a','a','b','b','c','c','c'};
        System.out.println(" String compressed for array "+ Arrays.toString(array)+" is having size : "+stringCompression.compress(array));

        System.out.println("------------------------------------------------------------------------------ ");

        str4 = "ab";
        str5 = "eidbaooo";

        System.out.println(" Does string : "+str5+" has a permutation of : "+str4+" ?? "+stringPermutation.checkInclusion(str4,str5));

        System.out.println("------------------------------------------------------------------------------ ");
        str4 = "1.101";
        str5 = "1.01001";
        System.out.println(" Comparing versions "+str4+" and "+str5+" gives : "+versionComparision.compare(str4, str5));

        System.out.println("------------------------------------------------------------------------------ ");

        str4 = "ADOBECODEBANC";
        str5 = "ABC";

        System.out.println("Min window subString of "+str5+" in "+str4+" is :"+minWindowSubString.betterCalculate(str4, str5));

        System.out.println("------------------------------------------------------------------------------ ");

        str5 = "eceec";
        System.out.println("is Valid Palindrome : "+validPalindrome2.isPalindrome(str5));

        System.out.println("------------------------------------------------------------------------------ ");
        str5 = "LEETCODE";
        System.out.println(" Total number of Unique chars in String "+str5+" are : "+uniqueCharsOfAllSubStrings.calculate(str5));

        System.out.println("------------------------------------------------------------------------------ ");

        str4 = "abcDExyz";
        str5 = "123LLcba";

        System.out.println(" Can we Split and make the Strings "+str4+" & "+str5+"a Palindrome ? "+splitStringsToMakePalindrome.checkPalindromeFormation(str4, str5));

    }
}