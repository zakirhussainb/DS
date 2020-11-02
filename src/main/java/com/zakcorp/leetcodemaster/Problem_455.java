package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_455 {
    static class Solver {
        public int solve1(int[] g, int[] s) {
            TreeMap<Integer, Integer> tMap = new TreeMap<>();
            for(int size : s) {
                tMap.put(size, tMap.getOrDefault(size, 0 ) + 1);
            }
            int count = 0;
            for(int gF: g) {
                if( tMap.containsKey(gF) ) {
                    count++;
                    removeKey(tMap, gF);
                } else if(tMap.higherKey(gF) != null) {
                    int num = tMap.higherKey(gF);
                    count++;
                    removeKey(tMap, num);
                }
            }
            return count;
        }
        private void removeKey(TreeMap<Integer, Integer> tMap, int key) {
            tMap.put(key, tMap.get(key) - 1);
            if(tMap.get(key) <= 0) {
                tMap.remove(key);
            }
        }
        public int solve2(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int i = 0;
            for(int j = 0; i < g.length && j < s.length; j++) {
                if(s[j] >= g[i]) {
                    i++;
                }
            }
            return i;
        }
    }
}
