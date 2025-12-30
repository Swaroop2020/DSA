package org.example.service.reverse;

public class ReverseWordsDelimiterPreserved {

    public String reverse(String str){

        char[] array = str.toCharArray();

        for(int i=0;i<array.length;i++) {
            while (i<array.length && array[i] == ' ') {
                i++;
            }

            int start = i;

            while(i<array.length && array[i] != ' '){
                i++;
            }
            reverseTheWord(array, start, i-1);
        }

        return new String(array);
    }

    private void reverseTheWord(char[] array, int start, int end){
        int i=start,j=end;

        while(i<j){
            while(!isAlphaNumeric(array[i])){
                i++;
            }

            while(!isAlphaNumeric(array[j])){
                j--;
            }
            swap(array, i, j);
            i++;
            j--;
        }
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private boolean isAlphaNumeric(char c) {
        return (c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9');
    }

    /** Here we don't convert the string to array */
    public String reverse2(String str){
        int n = str.length();
        StringBuilder builder = new StringBuilder(str.length());
        for(int i=0;i<n;i++) {
            while (i<n && str.charAt(i) == ' ') {
                i++;
            }

            int start = i;

            while(i<n && str.charAt(i)!= ' '){
                i++;
            }
            reverseIt(str, builder, start, i-1);
            builder.append(" ");
        }
        return builder.toString();
    }

    private void reverseIt(String str, StringBuilder builder, int start, int end) {
        // 1. Create a temp builder with the word/segment
        StringBuilder temp = new StringBuilder(str.substring(start, end + 1));

        int left = 0;
        int right = temp.length() - 1;

        // 2. Standard two-pointer swap
        while (left < right) {
            if (!isAlphaNumeric(temp.charAt(left))) {
                left++;
            } else if (!isAlphaNumeric(temp.charAt(right))) {
                right--;
            } else {
                // Swap the alphanumeric characters
                char lChar = temp.charAt(left);
                temp.setCharAt(left, temp.charAt(right));
                temp.setCharAt(right, lChar);
                left++;
                right--;
            }
        }
        builder.append(temp);
    }

}
