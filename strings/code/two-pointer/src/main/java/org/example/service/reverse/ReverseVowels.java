package org.example.service.reverse;

public class ReverseVowels {

    /** Here we convert the string to array */
    public String reverse(String str){
        if(str==null) return null;
        char[] array = str.toCharArray();
        int i = 0, j= str.length()-1;

        while (i<j){
            // Move i forward until a vowel is found
            while (i < j && !isVowel(array[i])) {
                i++;
            }
            // Move j backward until a vowel is found
            while (i < j && !isVowel(array[j])) {
                j--;
            }

            // Only swap if the pointers haven't crossed
            if (i < j) {
                char temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return new String(array);
    }

    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
                || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }

}
