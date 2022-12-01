package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2260
{
    static class Solver {
        public int solve1(int[] cards) {
            Map<Integer, Integer> map = new HashMap<>();
            int minVal = Integer.MAX_VALUE;
            for(int i = 0; i < cards.length; i++) {
                if(map.containsKey(cards[i])) {
                    minVal = Math.min(minVal, i - map.get(cards[i]) + 1);
                }
                map.put( cards[i], i );
            }
            return minVal == Integer.MAX_VALUE ? -1 : minVal;
        }
    }
}
