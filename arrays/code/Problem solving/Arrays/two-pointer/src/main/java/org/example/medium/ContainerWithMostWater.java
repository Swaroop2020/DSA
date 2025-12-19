package org.example.medium;

public class ContainerWithMostWater {

    public int calculate(int[] array){

        if(array == null || array.length<2)
            return 0;

        int i = 0;
        int j = array.length-1;
        int max = 0;
        while(i<j){
            max = Math.max((Math.min(array[i],array[j]) * (j-i)),max);
            if(array[i]<array[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
