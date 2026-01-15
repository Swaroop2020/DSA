package org.example.service.medium;

import java.util.*;

/// Leetcode : 49
public class GroupingAnagrams {

    public List<List<String>> groupAnagrams(String[] strings){
        if (strings == null || strings.length == 0) return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strings){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String sorted = new String(array);
            map.computeIfAbsent(sorted, s->new ArrayList<String>()).add(str);
        }
        List<List<String>> result = new ArrayList<>();

        for(String str : map.keySet()){
            result.add(map.get(str));
        }
        return result;
    }

    /// Here we didn't use hashmap
    public List<List<String>> groupAnagrams2(String[] strings) {
        if (strings == null || strings.length == 0) return new ArrayList<>();

        // 1. Map every string to a StringPair object
        List<StringPair> pairs = new ArrayList<>();
        for (String s : strings) {
            pairs.add(new StringPair(s));
        }

        // 2. Sort the list based on the 'sorted' key
        // This brings all anagrams next to each other
        pairs.sort(Comparator.comparing(p -> p.sorted));

        // 3. Collect adjacent anagrams into groups
        List<List<String>> result = new ArrayList<>();
        if (pairs.isEmpty()) return result;

        List<String> currentGroup = new ArrayList<>();
        currentGroup.add(pairs.get(0).original);

        for (int i = 1; i < pairs.size(); i++) {
            // If the current sorted key matches the previous one, they are anagrams
            if (pairs.get(i).sorted.equals(pairs.get(i - 1).sorted)) {
                currentGroup.add(pairs.get(i).original);
            } else {
                // New group found: save the old one and start a new one
                result.add(currentGroup);
                currentGroup = new ArrayList<>();
                currentGroup.add(pairs.get(i).original);
            }
        }
        result.add(currentGroup); // Add the last group

        return result;
    }

    // Helper class to keep the original string and its sorted key together
    class StringPair {
        String original;
        String sorted;

        StringPair(String original) {
            this.original = original;
            char[] chars = original.toCharArray();
            Arrays.sort(chars);
            this.sorted = new String(chars);
        }
    }
}
