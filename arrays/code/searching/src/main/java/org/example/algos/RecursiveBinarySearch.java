package org.example.algos;

public class RecursiveBinarySearch {

    public int search(int low, int high, int target, int[] array){
        if(low>high)
            return -1;
        int mid = (low + high)/2;
        if(array[mid]==target)
            return mid;
        else if(array[mid]>target)
            return search(low,mid-1, target,array);
        else
            return search(mid+1,high,target,array);
    }
}
