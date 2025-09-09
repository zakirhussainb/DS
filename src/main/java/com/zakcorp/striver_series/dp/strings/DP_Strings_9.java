package com.zakcorp.striver_series.dp.strings;

import java.util.Arrays;

public class DP_Strings_9 {
    static class Recursion {
        public boolean solve1(String str, String pattern) {
            int m = str.length(), n = pattern.length();
            return recur(n - 1, m - 1, str, pattern);
        }
        private boolean recur(int i, int j, String str, String pattern) {
            if(i < 0 && j < 0) return true;
            if(i < 0 && j >= 0) return false;
            if(j < 0 && i >= 0) {
                for(int x = 0; x <= i; x++) {
                    if(pattern.charAt(x) != '*')
                        return false;
                }
            }
            if(pattern.charAt(i) == str.charAt(j) || pattern.charAt(i) == '?') {
                return recur(i - 1, j - 1, str, pattern);
            }
            if(pattern.charAt(i) == '*') {
                return recur(i - 1, j, str, pattern) || recur(i, j - 1, str, pattern);
            }
            return false;
        }
    }

    static class Memoization {
        public boolean solve1(String str, String pattern) {
            int m = str.length(), n = pattern.length();
            int[][] memo = new int[n][m];
            for(int[] row : memo)
                Arrays.fill(row, -1);
            return memoized(n - 1, m - 1, str, pattern, memo);
        }
        private boolean memoized(int i, int j, String str, String pattern, int[][] memo) {
            if(i < 0 && j < 0) return true;
            if(i < 0 && j >= 0) return false;
            if(j < 0 && i >= 0) {
                for(int x = 0; x <= i; x++) {
                    if(pattern.charAt(x) != '*')
                        return false;
                }
                return true;
            }
            if(memo[i][j] != -1)
                return memo[i][j] == 1;
            if(pattern.charAt(i) == str.charAt(j) || pattern.charAt(i) == '?') {
                memo[i][j] = memoized(i - 1, j - 1, str, pattern, memo) ? 1 : 0;
                return memo[i][j] == 1;
            }
            if(pattern.charAt(i) == '*') {
                boolean match = memoized(i - 1, j, str, pattern, memo) || memoized(i, j - 1, str, pattern, memo);
                memo[i][j] = match ? 1 : 0;
                return match;
            } else {
                memo[i][j] = 0;
                return false;
            }
        }
    }
}
