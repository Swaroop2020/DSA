package org.example.algos;

public class BinarySearch {

    public int search(int[] array, int target){
        int start = 0;
        int mid;
        int end = array.length-1;
        while(start<end){
            mid = (start+end)/2;
            if(mid == target)
                return mid;
            else if(mid>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }

//    public int search(int[] array, int target){
//        int start = 0;
//        int mid;
//        int end = array.length-1;
//        while(start<=end){
//            mid=(start+end)/2;
//            if(array[mid]==target){
//                return mid;
//            }else if(array[mid]>target){
//                end = mid-1;
//            }else{
//                start = mid+1;
//            }
//        }
//
//        return -1;
//    }
}
