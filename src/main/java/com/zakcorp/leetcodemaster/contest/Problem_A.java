package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public String solve1(int[] ranks, char[] suits) {
            Map<Character, Integer> suitMap = new HashMap<>();
            Map<Integer, Integer> rankMap = new HashMap<>();
            for(char ch : suits) {
                suitMap.put(ch, suitMap.getOrDefault(ch, 0) + 1);
            }
            if(suitMap.size() == 1) {
                return "Flush";
            }
            for(int r : ranks) {
                rankMap.put(r, rankMap.getOrDefault(r, 0) + 1);
            }
            LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
            rankMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
            for(Map.Entry<Integer, Integer> entry : reverseSortedMap.entrySet()) {
                if(entry.getValue() >= 3) {
                    return "Three of a Kind";
                } else if(entry.getValue() >= 2) {
                    return "Pair";
                }
            }
            return "High Card";
        }
    }
}
