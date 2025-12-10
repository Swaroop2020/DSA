package org.example.hard;

import java.util.Arrays;


/// TODO  Learn optimization at https://www.youtube.com/watch?v=8ERS_4tSx2U
public class MinCostToMakeArrayEqual {

    public int calculate(int[] array, int[] cost){
        int[][] mappedArray = new int[array.length][2];
        for(int i=0;i<array.length;i++){
            mappedArray[i][0] = array[i];
            mappedArray[i][1] = cost[i];
        }

        Arrays.sort(mappedArray, (a,b)->Integer.compare(a[0],b[0]));

        int totalCost = 0;
        for(int i : cost)
            totalCost+=i;

        int prefix = 0;
        int median = 0;
        for(int i=0;i<mappedArray.length;i++){
            prefix += mappedArray[i][1];
            if(prefix >= (totalCost+1)/2){
                median = mappedArray[i][0];
                break;
            }
        }

        return costToMakeEqual(array, cost, median);
    }

    ///  Learn optimization at https://www.youtube.com/watch?v=8ERS_4tSx2U
    private int costToMakeEqual(int[] array, int[] cost, int median) {
        int totCost = 0;
        for(int i=0;i<array.length;i++){
            totCost+= Math.abs(median - array[i])*cost[i];
        }
        return totCost;
    }

}
