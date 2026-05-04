package org.example.exercise;

public class ReverseArray {

    public void reverse(int[] arr, int left, int right){
        if(left>=right) return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left+1, right-1);
    }
}
