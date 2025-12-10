package org.example.sorts;

public class HeapSortDesc {

    public void heapSortDescending(int[] arr) {
        int n = arr.length;

        // Step 1: Build min heap
        for (int i = n/2 - 1; i >= 0; i--)
            heapifyMin(arr, n, i);

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (min) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapifyMin(arr, i, 0);
        }
    }

    void heapifyMin(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is smaller
        if (left < n && arr[left] < arr[smallest])
            smallest = left;

        // If right child is smaller
        if (right < n && arr[right] < arr[smallest])
            smallest = right;

        // If smallest is not root
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            // Recursively heapify the affected sub-tree
            heapifyMin(arr, n, smallest);
        }
    }
}
