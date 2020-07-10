package com.zakcorp.leetcodemaster;

public class Problem_1299 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            int[] res = new int[n];
            int max = Integer.MIN_VALUE;
            res[n - 1] = -1;
            for(int i = n - 1; i > 0; i--) {
                max = Math.max(max, arr[i]);
                res[i - 1] = max;
            }
            return res;
        }
        public int[] solve2(int[] arr) {
            int n = arr.length;
            int max = -1;
            for(int i = n - 1; i >= 0; --i) {
                int temp = arr[i];
                arr[i] = max;
                max = Math.max(max, temp);
            }
            return arr;
        }
    }
}
