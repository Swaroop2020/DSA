package org.example.service.reverse;

public class RightRotateString {

    /** Approach 1
     * This is Interview standard
     */
    public String rightRotate(String str, int k){

        // 1. Safety check
        if (str == null || str.length() <= 1) return str;

        // 2. No rotation needed
        if (k == 0) return str;

        k%=str.length();

        char[] array = str.toCharArray();

        int i=0, j=array.length-1;
        reverse(array, i, j);

        i=0; j=k-1;
        reverse(array, i, j);

        i=k; j=array.length-1;
        reverse(array, i, j);

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
