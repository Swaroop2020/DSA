package org.example;

import org.example.easy.FirstOccuranceInString;
import org.example.easy.LongestCommonPrefix;
import org.example.easy.RepeatedSubStringPattern;
import org.example.hard.LPSArray;
import org.example.hard.LongestHappyPrefix;
import org.example.hard.ShortestPalindrome;
import org.example.medium.RepeatedStringMatch;

import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /// check for multiple methods
        FirstOccuranceInString firstOccuranceInString = new FirstOccuranceInString();
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        RepeatedSubStringPattern repeatedSubStringPattern = new RepeatedSubStringPattern();
        LPSArray lpsArray = new LPSArray();
        RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();
        LongestHappyPrefix longestHappyPrefix = new LongestHappyPrefix();
        ShortestPalindrome shortestPalindrome = new ShortestPalindrome();

        System.out.println("\n\n");

        String[] strings = Stream.of("flower", "flow", "floor").toArray(String[]::new);
        System.out.println(" longest common SubString in array "+ Arrays.toString(strings)+" is "+longestCommonPrefix.betterCalculate(strings));
        divide();

        String str = "sadbutsad";
        String str2 = "sad";
        System.out.println(" First occurance of "+str2+" in "+str+" is at index : "+firstOccuranceInString.betterCalculate(str, str2));
        divide();

        str = "abcabcabc";
        System.out.println("Does the String repeated substring pattern ? : "+repeatedSubStringPattern.bettercalculate(str));
        divide();

        str = "AABAACA";
        System.out.println("LPS for string "+str+" is "+Arrays.toString(lpsArray.computeLPS(str)));
        divide();

        str = "abcd";
        str2 = "cdabcdab";
        System.out.println("String "+str2+" would be a substring of string "+str+" if repeated times "+repeatedStringMatch.betterCalculate(str, str2));
        divide();

        str = "ababab";
        System.out.println(" Longest Happy Prefix in the string "+str+" is "+longestHappyPrefix.longestPrefix(str));
        divide();

        str = "abcd";
        System.out.println("Shortest Palindromic prefix for "+str+" would be "+shortestPalindrome.shortestPalindrome(str));
        divide();

        System.out.println("\n\n");

    }


    static void divide(){
        String divider = "-------------------------------------------------";
        System.out.println(divider);
    }
}