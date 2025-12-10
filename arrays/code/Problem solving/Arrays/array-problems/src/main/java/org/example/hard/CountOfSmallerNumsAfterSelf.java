package org.example.hard;

public class CountOfSmallerNumsAfterSelf {

    public int[] calculate(int[] array){
        int[] result = new int[array.length];

        int[][] pairs = new int[array.length][2];

        for(int i=0;i<array.length;i++){
            pairs[i][0] = array[i];
            pairs[i][1] = i;
        }

        mergeSort(result, pairs, 0, array.length-1);
        return result;
    }

    private void mergeSort(int[] result, int[][] pairs, int left, int right) {
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(result, pairs, left, mid);
            mergeSort(result, pairs, mid+1, right);
            merge(result, pairs, left, mid, right);
        }

    }

    private void merge(int[] result, int[][] pairs, int left, int mid, int right){

        int[][] temp = new int[right-left+1][2];
        int i=left, j=mid+1, k =0;
        while(i<=mid && j<=right){
            if(pairs[i][0]<=pairs[j][0]){
                temp[k++] = pairs[j++];
            }else{
                result[pairs[i][1]]+= (right-j+1);
                temp[k++] = pairs[i++];

            }

        }

        while(i<=mid) temp[k++] = pairs[i++];
        while(j<=right) temp[k++] = pairs[j++];

        for(int x=left;x<=right;x++){
            pairs[x] = temp[x-left];
        }

    }

}
