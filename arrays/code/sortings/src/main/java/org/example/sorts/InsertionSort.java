package org.example.sorts;

/**
 * time complexity:
 *      best : O(n)  // all the elements are sorted
 *      worst: O(n^2)
 *      avg : O(n^2)
 */
public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] array){
        for(int i=1;i<array.length; i++){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
}
