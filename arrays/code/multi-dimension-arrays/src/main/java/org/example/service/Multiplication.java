package org.example.service;

public class Multiplication {

    public int[][] multiply(int[][] array1, int[][] array2){

        if(array1[0].length != array2.length){
            System.out.println("Error, couldn't multiply");
            return null;
        }

        int rows = array1.length;
        int columns = array2[0].length;

        int[][] result = new int[rows][columns];
        for(int i=0; i<rows;i++){
            for(int j=0;j<columns;j++){
                for(int k=0;k< array2.length;k++){
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return result;
    }
}
