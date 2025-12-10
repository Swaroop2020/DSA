package org.example.sorts;

public class HoareQuickSort {

    public int[] sort(int[] array, int low, int high) {
        if (low < high) {
            int p = hoarePartition(array, low, high);
            sort(array, low, p);
            sort(array, p + 1, high);
        }
        return array;
    }

        private int hoarePartition(int[] array, int low, int high) {
            int piv = array[low];
            int i = low-1;
            int j = high+1;
            while(true) {
                do {
                    i++;
                } while (array[i]<piv);

                do {
                    j--;
                } while (array[j]>piv);

                if (i >= j)
                    return j;

                swap(array, i, j);
            }

    }


//    public int[] sort(int[] array, int low, int high){
//        if(low<high) {
//            int p = hoarePartition(array, low, high);
//            sort(array, low, p);
//            sort(array, p + 1, high);
//        }
//        return array;
//    }
//
//    private int hoarePartition(int[] array, int low, int high) {
//        int i= low -1;
//        int j= high+1;
//        int key = array[low];
//        while(true){
//            do{
//                i++;
//            }while (array[i]<key);
//
//            do{
//                j--;
//            }while (array[j]>key);
//
//            if(i>=j)
//                return j;
//
//            swap(array, i, j);
//        }
//    }



    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
