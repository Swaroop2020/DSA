package org.example;

import org.example.sorts.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sorter sorter = new BubbleSort();
        System.out.println("Bubble Sorted: "+Arrays.toString(sorter.sort(new int[]{3,8,1,4,7,2})));

        sorter = new SelectionSort();
        System.out.println("Selection Sorted: "+Arrays.toString(sorter.sort(new int[]{3,8,1,4,7,2})));

        sorter = new InsertionSort();
        System.out.println("Insertion Sorted: "+Arrays.toString(sorter.sort(new int[]{3,8,1,4,7,2})));

        sorter = new MergeSort();
        int[] array = {3,8,1,4,7,2};
        sorter.sort(array);
        System.out.println(Arrays.toString(array));

        MergeSort2 mergeSort = new MergeSort2();
        int[] arrayForSort = {3,8,1,4,7,2};
        mergeSort.splitAndSort(arrayForSort,0, arrayForSort.length-1);
        System.out.println("Merge Sorted 2 : "+Arrays.toString(arrayForSort));

        QuickSort quickSort = new QuickSort();
        int[] array1 = new int[]{3,8,1,4,7,2};
        array1 = quickSort.quickSort(array1, 0, array1.length-1);
        System.out.println("Quick Sorted: "+Arrays.toString(array1));

        HoareQuickSort hoareQuickSort = new HoareQuickSort();
        int[] array2 = new int[]{3,8,1,4,7,2};
        array2 = hoareQuickSort.sort(array2, 0, array2.length-1);
        System.out.println("Hoare quick sort : "+Arrays.toString(array2));

        sorter = new HeapSort();
        System.out.println("HeapSorted : "+Arrays.toString(sorter.sort(new int[]{3,8,1,4,7,2})));

        sorter = new LomutoQuickSort();
        System.out.println("QuickSorted : LOMUTO -> "+Arrays.toString(sorter.sort(new int[]{3,8,1,4,7,2})));

        HeapSortDesc descSort = new HeapSortDesc();
        int[] arra = new int[]{3,8,1,4,7,2};
        descSort.heapSortDescending(arra);
        System.out.println(Arrays.toString(arra));


    }
}