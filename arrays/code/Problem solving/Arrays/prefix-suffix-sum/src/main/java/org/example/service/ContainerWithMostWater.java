package org.example.service;

public class ContainerWithMostWater {

    public int calculate(int[] array){
        int i=0;
        int j=array.length-1;
        int maxArea = 0;

        while(i<j){
            maxArea = Math.max(maxArea, Math.min(array[i],array[j])*(j-i));
            if(array[i]<array[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}
