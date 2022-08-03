package com.zakcorp.leetcodemaster;

public class Problem_540 {
    static class Solver {
        // O(n) solution, but the problem is expecting an O(log N) solution.
        public int solve1(int[] arr) {
            int num = arr[0];
            for(int i = 1; i < arr.length; i++) {
                num ^= arr[i];
            }
            return num;
        }
    }
}
