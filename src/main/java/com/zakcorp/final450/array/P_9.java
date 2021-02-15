package com.zakcorp.final450.array;

/* Reverse the array */
public class P_9 {
    static class Solver {
        public int solve1(int[] arr, int n, int k) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }
            min = min + k;
            max = max - k;
            return Math.abs(max - min);
        }
    }
}
