package org.example.service.reverse;

public class ReverseSubStringRange {

    /** we are not converting the String to array but  we are using StringBuilder and .setCharAt() */
    public String reverse(String str, int start, int end){
        if (str == null) return null;
        StringBuilder stringBuilder = new StringBuilder(str);
        while(start<end){
            char lChar = stringBuilder.charAt(start);
            stringBuilder.setCharAt(start, stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, lChar);
            start++;
            end--;
        }
        return stringBuilder.toString();
    }
}
