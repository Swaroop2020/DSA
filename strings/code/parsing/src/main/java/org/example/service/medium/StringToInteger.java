package org.example.service.medium;

/// Leetcode 8
public class StringToInteger {

    public int toInt(String s){
        if(s==null || s.isEmpty()) return 0;

        int length = s.length();
        int index = 0;

        // skip leading whitespace
        while(index<length && s.charAt(index)==' '){
            index++;
        }

        // if string has only whitespaces
        if(index==length){
            return 0;
        }

        int sign = 1;
        if(s.charAt(index)=='-'){
            sign = -1;
        }

        // increment after +/-
        if(s.charAt(index)=='+' || s.charAt(index)=='-'){
            index++;
        }

        int result = 0;
        int threshold = Integer.MAX_VALUE/10;
        while(index<length){
            char currChar = s.charAt(index);
            if(currChar<'0'|| currChar>'9'){
                break;
            }
            // if threshold reaches return max/min values
            if(result>threshold ||
                    (result==threshold && currChar>'7')){
                return sign>0? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + (currChar - '0');
            index++;
        }
        return sign*result;
    }

}
