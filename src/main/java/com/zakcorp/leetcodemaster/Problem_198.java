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
    }
}
