package org.example.exercise;

import java.util.List;

public class Subsequences {

    /// This method is to find out all the possible subsequences
    public static void generate(String str, int index, String current, List<String> list) {
        // BaseCase
        if(index==str.length()){
            list.add(current);
            return;
        }

        generate(str, index+1, current+str.charAt(index), list);

        generate(str, index+1, current, list);
    }

    /// Here we have the constraint, we need subsequence of length k
    public static void generate(String str, int index, String current, List<String> list, int k) {
        // Pruning: not enough characters left
        if (current.length() + (str.length() - index) < k) {
            return;
        }
        if (current.length() > k) return;

        // Base case
        if (index == str.length()) {
            if (current.length() == k) {
                list.add(current);
            }
            return;
        }

        generate(str, index+1, current+str.charAt(index), list, k);

        generate(str, index+1, current, list, k);
    }

    public static String generate(String str, int index, String current,int k){

        if(current.length() > k) return null;//pruning

        if(current.length()==k) return current;

        if(index==str.length()) return null;

        String pick = generate(str, index+1, current+str.charAt(index),k);
        if(pick!=null) return pick;
        String notpick = generate(str, index+1, current,k);
        return notpick;
    }
}
