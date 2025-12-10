package org.example.service;

public class ProductExceptSelf {

    public int[] calculate(int[] array){
        int[] prod = new int[array.length];
        prod[0] = 1;

        for(int i=1;i<array.length;i++){
            prod[i] = prod[i-1]* array[i-1];
        }

        int product = 1;
        for(int i= array.length-1;i>=0;i--){
            prod[i] = prod[i]*product;
            product*=array[i];
        }
        return prod;
     }
}
