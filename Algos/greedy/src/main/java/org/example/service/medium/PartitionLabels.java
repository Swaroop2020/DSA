package org.example.service.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/// Leetcode 763
public class PartitionLabels {

    /// Time Complexity : O(n),  we parse the string twice so O(n)+O(n).
    /// Space Complexity : O(1), HashMap is used to store all the characters frequency.
    ///  characters are fixed to length 128 (ASCII) So it's constant space.
    public List<Integer> calculate(String s){
        int length = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=length-1;i>=0;i--){
            map.putIfAbsent(s.charAt(i),i);
        }

        System.out.println(map);

        int start = 0;
        int end = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<length;i++){
            end = end>map.get(s.charAt(i))? end : map.get(s.charAt(i));

            if(end==i){
                list.add(end-start+1);
                start = i+1;
            }

        }

        return list;
    }

}
