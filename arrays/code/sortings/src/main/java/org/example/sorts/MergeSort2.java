package org.example.sorts;

import java.util.Arrays;

public class MergeSort2 {

    public int[] splitAndSort(int[] array,int low, int high) {
        if(low<high){
            int mid = (low+high)/2;
            splitAndSort(array, low, mid);
            splitAndSort(array, mid+1, high);
            merge(array, low, mid, high);
        }
        return array;
    }

    public void merge(int[] array, int low, int mid, int high){
        int[] left = Arrays.copyOfRange(array, low, mid+1);
        int[] right = Arrays.copyOfRange(array, mid+1, high+1);
        int i=0, j=0, k=low;

        while(i< left.length && j< right.length){
            if(left[i]<=right[j]){
                array[k] = left[i];
                i++;
            }else{
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            array[k] = left[i];
            k++;
            i++;
        }

        while(j<right.length){
            array[k] = right[j];
            k++;
            j++;
        }

    }

//    public void merge(int[] array, int low, int mid, int high) {
//        int n1 = mid - low + 1;   // size of left subarray
//        int n2 = high - mid;      // size of right subarray
//
//        int[] left = new int[n1];
//        int[] right = new int[n2];
//
//        // Copy elements into temporary arrays
//        for (int i = 0; i < n1; i++)
//            left[i] = array[low + i];
//
//        for (int j = 0; j < n2; j++)
//            right[j] = array[mid + 1 + j];
//
//        int i = 0, j = 0, k = low;
//
//        // Merge the two halves
//        while (i < n1 && j < n2) {
//            if (left[i] <= right[j]) {
//                array[k] = left[i];
//                i++;
//            } else {
//                array[k] = right[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Copy remaining elements of left[], if any

//        while (i < n1) {
//            array[k] = left[i];
//            i++;
//            k++;
//        }
//
//        // Copy remaining elements of right[], if any
//        while (j < n2) {
//            array[k] = right[j];
//            j++;
//            k++;
//        }
//    }
}
