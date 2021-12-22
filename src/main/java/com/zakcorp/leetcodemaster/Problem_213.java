package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_213 {
    // Recursive TLE : House Robber II
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            if(n == 1)
                return arr[0];
            if(n == 2)
                return Math.max(arr[0], arr[1]);
            int one = recursive(arr, 0, n - 2);
            int two = recursive(arr, 1, n - 1);
            return Math.max(one, two);
        }
        private int recursive(int[] arr, int start, int end) {
            if(start > end)
                return 0;
            if(start == end)
                return arr[start];
            return Math.max( recursive(arr, start + 1, end), recursive(arr, start + 2, end) + arr[start] );
        }
    }
    static class Solver1 {
        public int solve1(int[] arr) {
            int n = arr.length;
            if(n == 1)
                return arr[0];
            if(n == 2)
                return Math.max(arr[0], arr[1]);
            int[][] memo = new int[n + 1][2];
            for(int[] m : memo) {
                Arrays.fill(m, -1);
            }
            int one = memoized(arr, 0, n - 2, memo, 0);
            int two = memoized(arr, 1, n - 1, memo, 1);
            return Math.max(one, two);
        }
        private int memoized(int[] arr, int start, int end, int[][] memo, int index) {
            if(start > end)
                return 0;
            if(start == end) {
                memo[start][index] = arr[start];
                return arr[start];
            }
            if(memo[start][index] != -1) {
                return memo[start][index];
            }
            memo[start][index] = Math.max( memoized(arr, start + 1, end, memo, index),
                    memoized(arr, start + 2, end, memo, index) + arr[start]);
            return memo[start][index];
        }
    }
}
