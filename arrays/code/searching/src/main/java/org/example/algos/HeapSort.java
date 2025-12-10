package org.example.algos;

public class HeapSort {

    public int[] sort(int[] array){
        int n = array.length;
        for(int i = n/2-1; i>=0; i--){
            heapify(array, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (max) to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Heapify reduced heap
            heapify(array, i, 0);
        }
        return array;
    }

    private void heapify(int[] array, int n, int i) {
        int root = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left<n && array[root]<array[left]){
            root = left;
        }
        if(right<n && array[root]<array[right]){
            root = right;
        }

        if(root != i){
            int temp = array[root];
            array[root] = array[i];
            array[i] = temp;

            heapify(array, n, root);
        }
    }
}
