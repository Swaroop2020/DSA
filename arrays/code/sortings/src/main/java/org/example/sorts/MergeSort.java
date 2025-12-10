package org.example.sorts;


import java.util.Arrays;

public class MergeSort implements Sorter{


    @Override
    public int[] sort(int[] array){
        if(array.length>1){
            int mid = array.length/2;
            int[] left = new int[mid];
            int[] right = new int[array.length-mid];

            left = Arrays.copyOfRange(array, 0, mid);
            right = Arrays.copyOfRange(array, mid, array.length);

//            for(int i=0;i<mid;i++){
//                left[i] = array[i];
//            }
//
//            for(int j=mid;j< array.length; j++){
//                right[j-mid] = array[j];
//            }
            sort(left);
            sort(right);
            merge(array, left, right);
        }
        return array;

    }


    private static void merge(int[] array, int[] left, int[] right){
        int i=0,j=0,k=0;
        while(i< left.length && j< right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            }else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        if(i<left.length){
            while(i< left.length){
                array[k] = left[i];
                i++;
                k++;
            }
        }

        if(j<right.length){
            while(j< right.length){
                array[k] = right[j];
                j++;
                k++;
            }
        }
    }

}
