package com.zakcorp.leetcodemaster;

public class Problem_1375 {
    static class Solver {
        public int solve1(int[] flips) {
            int right = 0, res = 0;
            for(int i = 0; i < flips.length; i++) {
                right = Math.max(right, flips[i]);
                if(right == i + 1) {
                    res++;
                }
            }
            return res;
        }
    }
}
