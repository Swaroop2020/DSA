package org.example.service.medium;

import java.util.TreeMap;

/// Leetcode : 846
public class HandOfStraights {

    /// Time Complexity: O(nlogn), treemap takes O(logn) for each put() operation.
    /// space Complexity: O(n). treemap size increases as number of elements increases.
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        // 1. Count frequencies in a sorted map
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        // 2. Process cards starting from the smallest
        for (int card : countMap.keySet()) {
            int count = countMap.get(card);
            if (count > 0) {
                // Need to form 'count' groups starting with this card
                for (int i = 0; i < groupSize; i++) {
                    int currentCard = card + i;
                    if (countMap.getOrDefault(currentCard, 0) < count) {
                        return false;
                    }
                    countMap.put(currentCard, countMap.get(currentCard) - count);
                }
            }
        }
        return true;
    }

}
