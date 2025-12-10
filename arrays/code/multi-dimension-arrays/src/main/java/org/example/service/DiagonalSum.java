package org.example.service;

public class DiagonalSum {

    // Works only for square matrix
    public int sum(int[][] matrix){
        int n  = matrix.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+= matrix[i][i];
            sum+= matrix[i][n-i-1];
        }

        if(n%2 != 0){
            sum = sum - matrix[n/2][n/2];
        }
        return sum;
    }
}
