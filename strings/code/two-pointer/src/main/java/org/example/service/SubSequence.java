package org.example.service;

public class SubSequence {

    public boolean isSubsequence(String main, String sub){

        if (main == null || sub == null) return false;
        if (sub.length() == 0) return true;
        if (main.length() < sub.length()) return false;

        int i=0, j=0;
        while (j < main.length() && i < sub.length()){
            if(main.charAt(j)==sub.charAt(i)){
                i++;
            }
            j++;
        }
        return i==sub.length();
    }
}
