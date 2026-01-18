package org.example.hard;

///  This is a building block for KMP (Knuth-Morris-Prat algorithm)
public class LPSArray {

    public int[] computeLPS(String str){
        int n = str.length();
        int i=1;
        int len = 0;
        int[] lps = new int[n];

        while(i<n){
            if(str.charAt(i) == str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }

        }
        return lps;
    }

}
