package org.example.sorts;

public class QuickSort{

    public int[] quickSort(int[] array, int low, int high){
        if(low < high){
            int p = lomutoPartition(array, low, high);
            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
        return array;
    }

    private int lomutoPartition(int[] array, int low, int high){
        int pivot = array[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(array[j]<pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;

    }

//    public int[] quickSort(int[] array, int low, int high) {
//        if(low < high){
//            int p = lomutoPartition(array, low, high);
//            quickSort(array, low, p-1);
//            quickSort(array,p+1,high);
//        }
//        return array;
//    }

//    private int lomutoPartition(int[] array, int low, int high) {
//        int i=low-1;
//        int key = array[high];
//        for(int j=low;j<high;j++){
//            if(array[j]< key){
//                i++;
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//
//        int temp = array[i+1];
//        array[i+1] = array[high];
//        array[high] = temp;
//
//        return i+1;
//    }

}
