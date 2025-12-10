package org.example;

import org.example.algos.BinarySearch;
import org.example.algos.LinearSearch;
import org.example.algos.RecursiveBinarySearch;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int[] array = {4,5,1,2,9,8,6};

        System.out.println("Given array is : "+Arrays.toString(array));

        LinearSearch linearSearch =new LinearSearch();
        System.out.println("position of 3 is : "+linearSearch.search(array,3));
        System.out.println("position of 2 is : "+linearSearch.search(array,2));
        System.out.println("position of 1 is : "+linearSearch.search(array,1));
        System.out.println("position of 4 is : "+linearSearch.search(array,4));
        System.out.println("position of 5 is : "+linearSearch.search(array,5));
        System.out.println("position of 9 is : "+linearSearch.search(array,9));

        array = new int[]{1, 2, 4, 5, 6, 8, 9};

        System.out.println("=============Binary Search Starts==============");
        BinarySearch binarySearch = new BinarySearch();

        System.out.println("position of 3 is : "+binarySearch.search(array,3));
        System.out.println("position of 2 is : "+binarySearch.search(array,2));
        System.out.println("position of 1 is : "+binarySearch.search(array,1));
        System.out.println("position of 4 is : "+binarySearch.search(array,4));
        System.out.println("position of 5 is : "+binarySearch.search(array,5));
        System.out.println("position of 9 is : "+binarySearch.search(array,9));

        System.out.println("=============Recursive Binary Search Starts==============");

        RecursiveBinarySearch recursiveBinarySearch= new RecursiveBinarySearch();
        System.out.println("position of 3 is : "+recursiveBinarySearch.search(0, array.length-1,3, array));
        System.out.println("position of 2 is : "+recursiveBinarySearch.search(0,array.length-1,2, array));
        System.out.println("position of 1 is : "+recursiveBinarySearch.search(0,array.length-1,1, array));
        System.out.println("position of 4 is : "+recursiveBinarySearch.search(0,array.length-1,4, array));
        System.out.println("position of 5 is : "+recursiveBinarySearch.search(0,array.length-1,5, array));
        System.out.println("position of 9 is : "+recursiveBinarySearch.search(0,array.length-1,9, array));
    }
}