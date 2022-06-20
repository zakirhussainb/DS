package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_198 {
    // Simple Brute Force - TLE
    static class Solver {
        public int solve1(int[] arr) {
            return recursive(arr.length - 1, arr);
        }
        private int recursive(int n, int[] arr) {
            if(n < 0)
                return 0;
            return Math.max( recursive(n - 2, arr) + arr[n], recursive(n - 1, arr) );
        }
    }

    // Good Solution
    static class Solver1 {
        public int solve1(int[] arr) {
            int[] memo = new int[arr.length + 1];
            Arrays.fill(memo, -1);
            return memoized(arr.length - 1, arr, memo);
        }
        private int memoized(int n, int[] arr, int[] memo) {
            if(n < 0)
                return 0;
            if(memo[n] >= 0)
                return memo[n];
            memo[n] = Math.max( memoized(n - 2, arr, memo) + arr[n], memoized(n - 1, arr, memo) );;
            return memo[n];
        }
        private final Map<Integer, Integer> memo = new HashMap<>();
        public int solve2(int[] arr) {
            return Math.max( recur(0, arr), recur(1, arr) );
        }
        private int recur(int i, int[] arr) {
            if(i >= arr.length)
                return 0;
            if(i == arr.length - 1)
                return arr[i];
            if(memo.containsKey(i)) {
                return memo.get(i);
            }
            memo.put(i, arr[i] + Math.max( recur(i + 2, arr), recur(i + 3, arr) ) );
            return memo.get(i);
        }
    }
    // Tabulation DP
    static class Solver2 {
        public int solve1(int[] arr) {
            int n = arr.length;
            if(n == 0)
                return 0;
            int[] dp = new int[n + 1];
            dp[1] = arr[0];
            for(int i = 2; i <= n; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i - 1]);
            }
            return dp[n];
        }
    }
}
