package org.example.service.reverse;

public class ReverseEachWord {

    /** Approach 1
     * Using Split and String builder
     * */
    public String reverse(String str){
        StringBuilder builder = new StringBuilder();
        String[] words = str.trim().split("\\s+");

        for(int i=0; i<words.length; i++){
            builder.append(new StringBuilder(words[i]).reverse());
            if(i!=words.length-1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    /** Approach 2
     * Using two pointer
     * Interview
     */
    public String betterReverse(String str){
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<str.length()){

            while(i<str.length() && str.charAt(i)==' '){
                i++;
            }

            int start = i;
            while (i<str.length() && str.charAt(i) != ' '){
                i++;
            }

            if(start<i){
                result.append(reverseWord(str, start, i-1));
                result.append(" ");
            }

        }
        if(!result.isEmpty())
            result.setLength(result.length()-1);
        return result.toString();
    }

    private String reverseWord(String str, int start, int end) {
        StringBuilder reverse = new StringBuilder();
        for(int i=end;i>=start;i--){
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}
