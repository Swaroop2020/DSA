package org.example.sorts;

public class HeapSort implements Sorter{

    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        for(int i=n/2-1; i>=0;i--){
            heapify(array, n, i);
        }

        for(int i=n-1;i>=0;i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapify(array,i,0);

        }

        return array;

    }

    private void heapify(int[] array, int n, int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int root = i;
        if(left<n && array[left]>array[root]){
            root = left;
        }

        if(right<n && array[right]>array[root]){
            root = right;
        }

        if(root!=i){
            int temp = array[i];
            array[i] = array[root];
            array[root] = temp;
            heapify(array, n, root);
        }

    }


//    @Override
//    public int[] sort(int[] array) {
//        int n = array.length;
//        for(int i = n/2-1;i>=0;i--){
//            heapify(array, n, i);
//        }
//        for(int i=n-1;i>=0;i--){
//            int temp = array[i];
//            array[i] = array[0];
//            array[0] = temp;
//            heapify(array,i,0);
//
//        }
//
//        return array;
//
//    }
//
//    private void heapify(int[] array, int n, int i) {
//        int root = i;
//        int left = 2*i+1;
//        int right = 2*i+2;
//        if(left<n && array[root]<array[left]){
//            root = left;
//        }
//
//        if(right<n && array[root]<array[right]){
//            root = right;
//        }
//
//        if(i!=root){
//            int temp = array[i];
//            array[i] = array[root];
//            array[root] = temp;
//            heapify(array, n, root);
//        }
//
//    }
}
