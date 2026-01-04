package org.example;

import org.example.service.medium.AllAnagramsInAString;
import org.example.service.medium.LongestSubStringWithAtmostKDistinct;
import org.example.service.medium.LongestSubstringNoRepeats;
import org.example.service.medium.SubStringsOfSizeKWithNoRepeats;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SubStringsOfSizeKWithNoRepeats subStringsOfSizeKWithNoRepeats = new SubStringsOfSizeKWithNoRepeats();
        LongestSubStringWithAtmostKDistinct longestSubStringWithAtmostKDistinct = new LongestSubStringWithAtmostKDistinct();
        LongestSubstringNoRepeats longestSubstringNoRepeats = new LongestSubstringNoRepeats();
        AllAnagramsInAString allAnagramsInAString = new AllAnagramsInAString();


        String str = "abcabc";
        System.out.println("SubStrings of Size 3 With No Repeats in string "+str+" are : "+subStringsOfSizeKWithNoRepeats.betterCalculate(str, 3));

        System.out.println(" ------------------------------------------------------------------- ");

        str = "aa";
        int k=1;
        System.out.println(" Longest SubString With Atmost "+k+" Distinct elements in string "+str+" is : "+longestSubStringWithAtmostKDistinct.calculate(str,k));
        System.out.println(" ------------------------------------------------------------------- ");

        str = "atlaspsp";
        System.out.println(" Longest Substring No Repeats in string "+str+" is : "+longestSubstringNoRepeats.calculate(str));
        System.out.println(" ------------------------------------------------------------------- ");

        str = "cbaebabacd";
        String str2 = "abc";
        System.out.println(" All Anagrams Of String "+str2+" in string "+str+" are :"+allAnagramsInAString.calculate(str, str2));

        System.out.println(" ------------------------------------------------------------------- ");

    }
}