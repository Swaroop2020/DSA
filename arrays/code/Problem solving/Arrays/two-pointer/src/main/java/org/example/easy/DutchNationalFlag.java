package org.example.easy;

public class DutchNationalFlag {

    public int[] calculate(int[] array){

        int low = 0, mid=0, high = array.length-1;
        while(mid<=high){
            switch(array[mid]){
                case 0:
                    swap(low, mid, array);
                    low++; mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(mid, high, array);
                    high--;
                    break;
            }
        }
        return array;
    }

    public void swap(int x, int y, int[] array){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
