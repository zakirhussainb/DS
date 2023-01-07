package com.zakcorp.leetcodemaster.contest;

public class Problem_C {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int xor = arr[0];
            for(int i = 1; i < n; i++) {
                xor ^= arr[i];
            }
            return xor;
        }
    }
}
