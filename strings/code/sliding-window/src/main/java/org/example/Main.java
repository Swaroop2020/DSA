package org.example;

import org.example.service.medium.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SubStringsOfSizeKWithNoRepeats subStringsOfSizeKWithNoRepeats = new SubStringsOfSizeKWithNoRepeats();
        LongestSubStringWithAtmostKDistinct longestSubStringWithAtmostKDistinct = new LongestSubStringWithAtmostKDistinct();
        LongestSubstringNoRepeats longestSubstringNoRepeats = new LongestSubstringNoRepeats();
        AllAnagramsInAString allAnagramsInAString = new AllAnagramsInAString();
        LongestRepeatingCharReplacement longestRepeatingCharReplacement = new LongestRepeatingCharReplacement();
        MaxVowelsInSubStringOfSizeK maxVowelsInSubStringOfSizeK = new MaxVowelsInSubStringOfSizeK();

        String divider = "----------------------------------------------------------------------";

        String str = "abcabc";
        System.out.println("SubStrings of Size 3 With No Repeats in string "+str+" are : "+subStringsOfSizeKWithNoRepeats.betterCalculate(str, 3));

        System.out.println(divider);

        str = "aa";
        int k=1;
        System.out.println(" Longest SubString With Atmost "+k+" Distinct elements in string "+str+" is : "+longestSubStringWithAtmostKDistinct.calculate(str,k));
        System.out.println(divider);

        str = "atlaspsp";
        System.out.println(" Longest Substring No Repeats in string "+str+" is : "+longestSubstringNoRepeats.calculate(str));
        System.out.println(divider);

        str = "cbaebabacd";
        String str2 = "abc";
        System.out.println(" All Anagrams Of String "+str2+" in string "+str+" are :"+allAnagramsInAString.calculate(str, str2));

        System.out.println(divider);

        str = "AABABBA";
        k=1;
        System.out.println(" longest Repeating Char Replacement for string "+str+" with max replacement "+k+" is : "+longestRepeatingCharReplacement.calculate(str,k));
        System.out.println(divider);

        System.out.println(divider);
        str = "abciiiidef";
        k=3;
        System.out.println(" Max vowls in a substring of length "+k+" in string "+str+" is : "+maxVowelsInSubStringOfSizeK.getMaxVowels(str,k));

        System.out.println(divider);

    }
}