package org.example.service;

public class SearchInSorted {

    public int[] find(int[][] matrix, int target){
        int rdx = potentialRow(matrix, target);
        if(rdx==-1) return null;
        else return binarySearchOnRow(matrix, rdx, target);
    }

    private int[] binarySearchOnRow(int[][] matrix, int rdx, int target) {
        int low = 0;
        int high = matrix[rdx].length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[rdx][mid]==target) return new int[]{rdx,mid};
            else if(matrix[rdx][mid]>target) high = mid-1;
            else low =mid+1;
        }
        return null;
    }

    private int potentialRow(int[][] matrix, int target) {
        int low =0;
        int high = matrix.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(matrix[mid][0]<=target && target<=matrix[mid][matrix[mid].length-1]){
                return mid;
            }else if(matrix[mid][0]>target)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
