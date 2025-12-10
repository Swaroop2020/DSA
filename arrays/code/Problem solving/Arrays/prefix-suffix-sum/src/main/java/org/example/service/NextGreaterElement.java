package org.example.service;

import java.util.Stack;

public class NextGreaterElement {

    public int[] calculate(int[] array){
        Stack<Integer> helperStack = new Stack<>();

        int[] nextGreaterElement = new int[array.length];

        for(int i=array.length-1;i>=0;i--){

            while(!helperStack.isEmpty() && helperStack.peek()<array[i]){
                helperStack.pop();
            }

            if(helperStack.isEmpty()){
                nextGreaterElement[i] = -1;
            }else {
                nextGreaterElement[i] = helperStack.peek();
            }

            helperStack.push(array[i]);

        }
        return nextGreaterElement;
    }
}
