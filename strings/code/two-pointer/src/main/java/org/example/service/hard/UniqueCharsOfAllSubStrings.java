package org.example.service.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/// 828 : Count Unique Characters of All Substrings of a Given String
/// Look for better solution later
public class UniqueCharsOfAllSubStrings {

    public int calculate(String str) {
        HashMap<Character, List<Integer>> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            List list = new ArrayList();
            list.add(-1);
            map.put(c, list);
        }

        for (int i = 0; i < str.length(); i++) {
            List list = map.get(str.charAt(i));
            list.add(i);
            map.put(str.charAt(i), list);
        }

        int count = 0;
        for (char c : map.keySet()) {
            List<Integer> list = map.get(c);
            list.add(str.length());
            for(int i=1;i<list.size()-1;i++){
                int curr = list.get(i);
                int prev = list.get(i-1);
                int next = list.get(i+1);

                int possibleStartPoints = curr - prev;
                int possibleEndPoints = next - curr;
                count += possibleStartPoints * possibleEndPoints;
            }
        }
        return count;
    }
}
