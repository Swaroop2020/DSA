package org.example.service.reverse;

public class ReverseWords {

    /** Easy - Peasy */
    public String calculate(String str){
        if (str == null) return null;
        StringBuilder result = new StringBuilder();

        String[] words = str.trim().split("\\s+");

        int i=words.length-1;
        while(i>=0){
            result.append(words[i]);
            if(i!=0) result.append(" ");
            i--;
        }
        return result.toString();

    }

    /** Interview Approach
     * we are not using str.split()
     */
    public String betterCalculate(String str){

        if (str == null) return null;
        StringBuilder result = new StringBuilder();

        int i = str.length()-1;

        while(i>=0){

            /// skip spaces
            while(i>=0 && str.charAt(i)==' '){
                i--;
            }

            int end = i;

            /// find word start
            while(i>=0 && str.charAt(i)!=' '){
                i--;
            }

            if (end >= 0) {
                if (result.length() > 0) result.append(" ");
                result.append(str.substring(i + 1, end + 1));
            }
        }

        return result.toString();
    }


}
