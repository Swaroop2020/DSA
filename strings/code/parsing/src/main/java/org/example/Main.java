package org.example;

import org.example.service.hard.ValidNumber;
import org.example.service.medium.GroupingAnagrams;
import org.example.service.medium.MatchingSubsequences;
import org.example.service.medium.MaxNumberOfNonIntersectingSubStrings;
import org.example.service.medium.StringToInteger;

import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ValidNumber validNumber = new ValidNumber();
        StringToInteger stringToInteger = new StringToInteger();
        GroupingAnagrams groupingAnagrams = new GroupingAnagrams();
        MatchingSubsequences matchingSubsequences = new MatchingSubsequences();
        MaxNumberOfNonIntersectingSubStrings mnnss = new MaxNumberOfNonIntersectingSubStrings();

        String str = ".";
        System.out.println(" Is valid number "+str+" ?"+validNumber.isValidNumber(str));
        divide();

        str = "    -34+1";
        System.out.println(" parsing real number out of "+str+" then we get : "+stringToInteger.toInt(str));
        divide();

        String[] strings = Stream.of("eat", "tea", "tan", "ate", "nat", "bat").toArray(String[]::new);
        System.out.println(" grouping anagrams: "+groupingAnagrams.groupAnagrams(strings));
        System.out.println(" - "+groupingAnagrams.groupAnagrams2(strings));
        divide();

        str = "abcde";
        strings = new String[]{"a","bb","dab","ace","ade"};
        System.out.println(" Matching subsequences for words "+ Arrays.toString(strings)+" in string "+str+" is : "+matchingSubsequences.countMatches(str, strings));
        divide();
        //matchingSubsequences.countMatches();

        System.out.println(mnnss.maxSubstrings("abcdeafdef"));
    }

    static void divide(){
        String divider = "-------------------------------------------------";
        System.out.println(divider);
    }
}