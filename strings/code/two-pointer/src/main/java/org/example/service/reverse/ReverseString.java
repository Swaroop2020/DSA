package org.example.service.reverse;

public class ReverseString {

    public String calculate(String str){

        // 1. Safety check
        if (str == null || str.isEmpty()) {
            return str;
        }

        char[] characters = str.toCharArray();
        int i=0, j=characters.length-1;

        while(i<j){
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }
        return new String(characters);
    }

    /** Even this doesn't work for more variable emojis */
    public String betterCalculate(String str){

        if(str==null || str.isEmpty()){
            return str;
        }

        int[] codePoints = str.codePoints().toArray();

        int i =0;
        int j=codePoints.length-1;

        while(i<j){
            int temp = codePoints[i];
            codePoints[i] = codePoints[j];
            codePoints[j] = temp;
            i++;
            j--;
        }
        return new String(codePoints, 0, codePoints.length);
    }

    public String easyPeasy(String str) {
        if(str == null || str.isEmpty()){
            return str;
        }

        return new StringBuilder(str).reverse().toString();
    }
}
