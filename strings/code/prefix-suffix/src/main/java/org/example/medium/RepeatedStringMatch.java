package org.example.medium;

/// Leetcode 686
public class RepeatedStringMatch {

    public int calculate(String a, String b){
        StringBuilder repeated = new StringBuilder(a);
        int count =1;
        while (repeated.length()<b.length()){
            repeated.append(a);
            count++;
        }

        if(repeated.indexOf(b)!=-1) return count;

        repeated.append(a);
        count++;

        if(repeated.indexOf(b)!=-1) return count;

        return -1;
    }

    /// using LPS and KMP
    public int betterCalculate(String a, String b){
         int n = a.length();
         int m = b.length();

         int[] lps = getLPS(b);
         int i=0, j=0;
         while(i<m+n){
             while(j<m && a.charAt(i%n)==b.charAt(j)){
                 i++;
                 j++;
             }
             if(j==m) break;
             if(j>0){
                 j=lps[j-1];
             }else{
                 i++;
             }
         }
        if(j!=m)
            return -1;
        else return (i+n-1)/n;
    }

    public static int[] getLPS(String s){
        int[] lps = new int[s.length()];
        int i=1, len=0;

        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                lps[i] = ++len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] =0;
                    i++;
                }
            }
        }
        return lps;
    }

}
