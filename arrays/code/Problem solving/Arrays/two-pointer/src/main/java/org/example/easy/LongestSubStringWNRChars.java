package org.example.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

///  longest substring with non repeating characters
public class LongestSubStringWNRChars {

    public int calculate(String str){
        if(str==null || str.length()==0){
            return 0;
        }
        int i=0, j=0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        while(j<str.length()){
            while(!set.add(str.charAt(j))){
                set.remove(str.charAt(i));
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }

    ///  fewer iterations
    public int betterCalculate(String str) {
        if (str == null || str.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, max = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
