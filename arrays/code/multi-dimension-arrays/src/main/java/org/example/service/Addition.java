package org.example.service;

public class Addition {

    public int[][] add(int[][] array1, int[][] array2){

        int rows = array1.length;
        int columns = array1[0].length;

        if(rows!= array2.length || columns != array2[0].length){
            System.out.println(" Error, Couldn't perform matrix addition.");
        }
        int[][] result = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }
}
