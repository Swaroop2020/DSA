package org.example.service;

public class BoundarySum {

    public int calculateSum(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int sum =0;

        for(int i=0; i<columns; i++){
            sum+= matrix[0][i];
        }

        if(rows>1){
            for(int i =0; i<columns; i++){
                sum+=matrix[rows-1][i];
            }
        }

        for(int i =1; i<rows-1; i++){
            sum+= matrix[i][0];
            if(columns>1){
                sum+= matrix[i][columns-1];
            }
        }
        return sum;
    }
}
