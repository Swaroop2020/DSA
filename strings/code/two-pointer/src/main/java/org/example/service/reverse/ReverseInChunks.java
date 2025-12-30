package org.example.service.reverse;


public class ReverseInChunks {

    public String reverse(String str,int k){
        /// Edge case
        if (str == null || k <= 1) return str;

        StringBuilder builder = new StringBuilder(str);

        for(int i=0;i<builder.length();i=i+(2*k)){
            swap(builder, i, i+k-1);
        }
        return builder.toString();
    }

    private void swap(StringBuilder builder, int i, int j){
        j = Math.min(j, builder.length()-1);
        while(i<j){
            char temp = builder.charAt(i);
            builder.setCharAt(i,builder.charAt(j));
            builder.setCharAt(j, temp);
            i++;
            j--;
        }
    }

}
