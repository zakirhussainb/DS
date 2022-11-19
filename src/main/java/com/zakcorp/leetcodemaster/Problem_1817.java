package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1817
{
    static class Solver {
        public int[] solve1(int[][] logs, int k) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for(int[] log : logs) {
                if(!map.containsKey( log[0] )) {
                    map.put( log[0], new HashSet<>() );
                }
                map.get(log[0]).add( log[1] );
            }
            Map<Integer, Integer> uam = new HashMap<>();
            for(Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
                int size = entry.getValue().size();
                uam.put( size, uam.getOrDefault( size, 0 ) + 1 );
            }
            int[] res = new int[k];
            int j = 1;
            for(Map.Entry<Integer, Integer> entry : uam.entrySet()) {
                res[entry.getKey() - 1] = entry.getValue();
                j++;
            }
            return res;
        }
        public int[] solve2(int[][] logs, int k) {
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for(int[] log : logs) {
                if(!map.containsKey( log[0] )) {
                    map.put( log[0], new HashSet<>() );
                }
                map.get(log[0]).add( log[1] );
            }
            int[] res = new int[k];
            for(int user : map.keySet()) {
                res[map.get(user).size() - 1]++;
            }
            return res;
        }
    }
}
