package org.example;

import org.example.service.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Addition addition = new Addition();
        Multiplication multiplication = new Multiplication();
        Transpose transpose = new Transpose();
        DiagonalSum diagonalSum = new DiagonalSum();
        SearchInSorted searchInSorted = new SearchInSorted();
        Rotate90 rotate90 = new Rotate90();
        BoundarySum boundarySum = new BoundarySum();

        int[][] array = new int[2][3];
        array[0] = new int[]{2,3,4};
        array[1] = new int[]{5,6,7};

        int[][] array2 = new int[2][3];
        array2[0] = new int[]{2,3,4};
        array2[1] = new int[]{5,6,7};

        System.out.println(array);
        System.out.println(Arrays.deepToString(array));
        System.out.println(array.length);

        System.out.println("added is : "+Arrays.deepToString(addition.add(array,array2)));
        System.out.println("multiplied is : "+Arrays.deepToString(multiplication.multiply(array, array2)));

        int[][] jagged = new int[2][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        System.out.println(Arrays.deepToString(jagged));

        int[][] matrix = new int[][]{{3,1,2},{6,8,5},{9,4,7}};
        int[][] squareTranspose = transpose.squareTranspose(matrix);
        matrix = new int[][]{{3,1,2},{6,8,5}};
        int[][] strongTranspose = transpose.strongTranspose(matrix);
        System.out.println(Arrays.deepToString(squareTranspose));
        System.out.println(Arrays.deepToString(strongTranspose));

        matrix = new int[][]{{3,1,2},{6,8,5},{9,4,7}};
        int sumOfDiagonal = diagonalSum.sum(matrix);
        System.out.println("Diagonal sum of : "+Arrays.deepToString(matrix)+" is : "+sumOfDiagonal);

        matrix = new int[][]{{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int[] index = searchInSorted.find(matrix, 16);
        System.out.println("searchInSorted : "+Arrays.toString(index));

        matrix = new int[][]{{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        matrix = rotate90.rotate(matrix);
        System.out.println("rotated : "+Arrays.deepToString(matrix));

        matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("sum of boundary elements : "+boundarySum.calculateSum(matrix));
     }
}