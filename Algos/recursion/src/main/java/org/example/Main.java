package org.example;

import org.example.exercise.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        First first = new First();
        SumOfFirstN sumOfFirstN = new SumOfFirstN();
        ReverseArray reverseArray = new ReverseArray();
        PalindromeString palindromeString = new PalindromeString();
        Subsequences subsequences = new Subsequences();

        first.print(5);
        System.out.println();
        first.printReverse(5);

        seperate();

        System.out.println(sumOfFirstN.calculate(5));

        seperate();

        int[] array = new int[]{1,2,3,4,5};
        reverseArray.reverse(array,0, array.length-1);
        System.out.println(Arrays.toString(array));

        seperate();

        String str = "ABCDCBA";
        System.out.println(palindromeString.isPalindrome(str,0, str.length()-1));
        String strt = "A man a plan a canal Panama";
        System.out.println(palindromeString.isPalindromeIgnoreCaseAndSpace(strt, 0, strt.length()-1));

        str = "abc";
        List<String> list = new ArrayList<>();
        Subsequences.generate(str, 0, "", list);
        System.out.println(list);

        seperate();

        List<String> subsOfSize2 = new ArrayList<>();
        Subsequences.generate(str, 0, "", subsOfSize2, 2);
        System.out.println(subsOfSize2);

        seperate();
        System.out.println("----- this is for subsequence size 2 ------");
        System.out.println(Subsequences.generate(str, 0,"", 2));


    }

    private static void seperate() {
        System.out.println();
        System.out.println("----------------------------------------");
    }
}