package org.example.service;

import java.util.TreeMap;

public class HandOfStraights {

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
