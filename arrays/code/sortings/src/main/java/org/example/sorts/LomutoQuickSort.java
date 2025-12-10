package org.example.sorts;

public class LomutoQuickSort implements Sorter{

    @Override
    public int[] sort(int[] array) {
        lomutoSort(array, 0, array.length-1);
        return array;
    }

    private void lomutoSort(int[] array,int low,int high) {
        if(low<high){
            int pivotIndex = partition(array, low, high);
            lomutoSort(array, low, pivotIndex-1);
            lomutoSort(array, pivotIndex+1,high);
        }


    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[high];
        array[high] = array[i+1];
        array[i+1] = temp;
        return i+1;

    }
}
