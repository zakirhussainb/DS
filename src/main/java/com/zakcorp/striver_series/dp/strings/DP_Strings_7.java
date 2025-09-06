package com.zakcorp.striver_series.dp.strings;

import java.util.Arrays;

public class DP_Strings_7 {
    private static final int MOD = 1000_000_007;
    static class Recursion {
        public int solve1(String s, String t) {
            int m = s.length(), n = t.length();
            return recur(m - 1, n - 1, s, t);
        }
        private int recur(int i, int j, String str1, String str2) {
            if(j < 0) {
                return 1;
            }
            if(i < 0) {
                return 0;
            }
            if(str1.charAt(i) == str2.charAt(j)) {
                return recur(i - 1, j, str1, str2) + recur(i - 1, j - 1, str1, str2);
            } else {
                return recur(i - 1, j, str1, str2);
            }
        }
    }

    static class Memoization {
        public int solve1(String s, String t) {
            int m = s.length(), n = t.length();
            int[][] memo = new int[m][n];
            for(int i = 0; i < m; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(m - 1, n - 1, s, t, memo);
        }
        private int memoized(int i, int j, String str1, String str2, int[][] memo) {
            if(j < 0) {
                return 1;
            }
            if(i < 0) {
                return 0;
            }
            if(memo[i][j] != -1) {
                return memo[i][j];
            }
            if(str1.charAt(i) == str2.charAt(j)) {
                memo[i][j] = memoized(i - 1, j, str1, str2, memo) % MOD + memoized(i - 1, j - 1, str1, str2, memo) % MOD;
            } else {
                memo[i][j] = memoized(i - 1, j, str1, str2, memo) % MOD;
            }
            return memo[i][j];
        }
    }
}
