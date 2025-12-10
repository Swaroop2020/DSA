package org.example.sorts;

public class BubbleSort implements Sorter{

    @Override
    public int[] sort(int[] array){
        for(int i=0; i<array.length-1; i++){
            boolean swapped = false;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        return array;
    }

}
