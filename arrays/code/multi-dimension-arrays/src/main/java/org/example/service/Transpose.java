package org.example.service;

public class Transpose {

    public int[][] squareTranspose(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int i=0; i<rows;i++){
            for(int j=i+1;j<columns;j++){
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        return matrix;
    }

    public int[][] strongTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposed = new int[columns][rows];
        for(int i=0; i<rows; i++){
            for(int j=0;j<columns;j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
