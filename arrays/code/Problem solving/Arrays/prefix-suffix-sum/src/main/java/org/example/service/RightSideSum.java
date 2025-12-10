package org.example.service;

/// Right side sum
///For each index i, compute the sum of all elements to the right.
///arr = [3, 4, 2, 1]
/// Result:
/// [7, 3, 1, 0]
public class RightSideSum {

    public int[] calculate(int[] array){
        if(array.length==0)
            return new int[0];

        int rightSum = 0;
        for(int i= array.length-1;i>=0;i--){
            rightSum+=array[i];
            array[i] = rightSum-array[i];
        }
        return array;
    }
}
