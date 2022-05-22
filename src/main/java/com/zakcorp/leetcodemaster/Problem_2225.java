package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2225 {
    static class Solver {
        public List<List<Integer>> solve1(int[][] matches) {
            Map<Integer, Integer> loserMap = new TreeMap<>();
            for (int[] match : matches) {
                loserMap.put(match[1], loserMap.getOrDefault(match[1], 0) + 1);
            }
            Set<Integer> winnerSet = new TreeSet<>();
            for (int[] match : matches) {
                if(!loserMap.containsKey(match[0])) {
                    winnerSet.add(match[0]);
                }
            }
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(winnerSet));
            List<Integer> lostExactlyOneMatchList = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : loserMap.entrySet()) {
                if(entry.getValue() == 1)
                    lostExactlyOneMatchList.add(entry.getKey());
            }
            result.add(new ArrayList<>(lostExactlyOneMatchList));
            return result;
        }
    }
}
