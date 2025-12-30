package org.example.service.reverse;

public class LeftRotateString {

    /** Approach 1
     * This is Easy peasy
     * */
    public String leRotate(String str, int k) {
        // 1. Safety check
        if (str == null || str.length() <= 1) return str;

        // 2. No rotation needed
        if (k == 0) return str;

        int n = str.length();
        k = k % n;

        // Take the part from k to end, and append the part from 0 to k
        return str.substring(k) + str.substring(0, k);
    }
    /** Approach 2 */
    public String leftRotate(String str, int k){
        // 1. Safety check
        if (str == null || str.length() <= 1) return str;

        // 2. No rotation needed
        if (k == 0) return str;
        k = k%str.length();

        char[] array = str.toCharArray();
        char[] temp = new char[k];
        for(int i=0;i<k;i++){
            temp[i] = array[i];
        }

        for(int i=k;i< array.length;i++){
            array[i-k] = array[i];
        }

        for(int i=array.length-k; i<array.length;i++){
            array[i] = temp[i-(array.length-k)];
        }

        return new String(array);
    }

    /**  Approach 3
     * Rotate all the elements
     * Rotate length-k elements
     * rotate last k elements
     * */
    public String lRotate(String str, int k){
        // 1. Safety check
        if (str == null || str.length() <= 1) return str;

        // 2. No rotation needed
        if (k == 0) return str;
        k = k%str.length();

        char[] array = str.toCharArray();
        int i=0, j= array.length-1;
        reverse(array,i,j);

        i=0; j= array.length-k-1;
        reverse(array,i,j);

        i= array.length-k;
        j=array.length-1;
        reverse(array,i,j);

        return new String(array);
    }

    private void reverse(char[] array, int i, int j){
        while(i<j){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
