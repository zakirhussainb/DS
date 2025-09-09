package com.zakcorp.striver_series.dp.strings;

import java.util.Arrays;

public class DP_Strings_8 {
    static class Recursion {
        public int solve1(String start, String target) {
            int m = start.length(), n = target.length();
            return recur(m - 1, n - 1, start, target);
        }
        private int recur(int i, int j, String start, String target) {
            if(i < 0) return j + 1;

            if(j < 0) return i + 1;

            if(start.charAt(i) == target.charAt(j)) {
                return recur(i - 1, j - 1, start, target);
            }
            return 1 + Math.min( recur(i - 1, j, start, target),
                    Math.min(recur(i - 1, j - 1, start, target), recur(i, j - 1, start, target)) );
        }
    }

    static class Memoization {
        public int solve1(String start, String target) {
            int m = start.length(), n = target.length();
            int[][] memo = new int[m][n];
            for(int i = 0;i < m; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(m - 1, n - 1, start, target, memo);
        }
        private int memoized(int i, int j, String start, String target, int[][] memo) {
            if(i < 0) return j + 1;

            if(j < 0) return i + 1;

            if(memo[i][j] != -1) {
                return memo[i][j];
            }

            if(start.charAt(i) == target.charAt(j)) {
                return memoized(i - 1, j - 1, start, target, memo);
            }
            memo[i][j] =  1 + Math.min( memoized(i - 1, j, start, target, memo),
                    Math.min(memoized(i - 1, j - 1, start, target, memo), memoized(i, j - 1, start, target, memo)) );

            return memo[i][j];
        }
    }
}
