package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_370 {
    static class Solver {
        public int[] solve1(int length, int[][] updates) {
            int[] res = new int[length];
            for (int[] update : updates) {
                int sI = update[0];
                int eI = update[1];
                int inc = update[2];
                for (int j = sI; j <= eI; j++) {
                    res[j] += inc;
                }
            }
            return res;
        }
        public int[] solve2(int n, int[][] updates) {
            int[] res = new int[n];
            for(int[] update : updates) {
                int sI = update[0];
                int eI = update[1];
                int inc = update[2];
                res[sI] += inc;
                if(eI + 1 < n) {
                    res[eI + 1] -= inc;
                }
            }
            for(int i = 1; i < n; i++) {
                res[i] += res[i - 1];
            }
            return res;
        }
    }
}
