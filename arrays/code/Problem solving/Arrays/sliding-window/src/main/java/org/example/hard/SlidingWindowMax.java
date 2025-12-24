package org.example.hard;

import java.util.ArrayDeque;
import java.util.Deque;

///  Leetcode 239
public class SlidingWindowMax {

    public int[] calculate(int[] nums, int k){

        if(nums==null || nums.length ==0 || k<=0)
            return new int[0];

        Deque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] result = new int[n-k+1];

        for(int i=0;i<nums.length;i++){

            /// remove those indeces that are not part of current window
            while(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                deque.pollFirst();
            }

            /// ensure that the deques stores values in descending order
            /// we remove smaller elements as they doesn't matter. we need max element in the window
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }

            /// add the current elements index
            deque.offerLast(i);

            /// add max element of the window to the result array
            if(i>=k-1){
                result[i-k+1] = nums[deque.peekFirst()];
            }

        }
        return result;
    }

}
