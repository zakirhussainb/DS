package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2244
{
    static class Solver {
        public int solve1(int[] tasks) {
            Map<Integer, Integer> map = new HashMap<>();
            for ( int task : tasks ) {
                map.put( task, map.getOrDefault( task, 0 ) + 1 );
            }
            int minRounds = 0;
            for(int count : map.values()) {
                if(count == 1)
                    return -1;
                if(count % 3 == 0) {
                    minRounds += count / 3;
                } else {
                    minRounds += count / 3 + 1;
                }
            }
            return minRounds;
        }
    }
}
