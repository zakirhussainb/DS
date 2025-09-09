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
            int result = 0;
            if(str1.charAt(i) == str2.charAt(j)) {
                result = memoized(i - 1, j, str1, str2, memo) + memoized(i - 1, j - 1, str1, str2, memo);
            } else {
                result = memoized(i - 1, j, str1, str2, memo);
            }
            memo[i][j] = result % MOD;
            return memo[i][j];
        }
    }

    static class Tabulation {
        public int solve1(String s, String t) {
            int m = s.length(), n = t.length();
            int[][] dp = new int[m + 1][n + 1];
            // Base case
            for(int r = 0; r <= m; r++) {
                dp[r][0] = 1;
            }
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    int result = 0;
                    if(s.charAt(i - 1) == t.charAt(j - 1)) {
                        result = dp[i - 1][j] + dp[i - 1][j - 1];
                    } else {
                        result = dp[i - 1][j];
                    }
                    dp[i][j] = result % MOD;
                }
            }
            return dp[m][n];
        }
    }

    /*static class SpaceOptimization {
        public int solve1(String s, String t) {
            int m = s.length(), n = t.length();
            int[] prev = new int[m + 1];
            int[] curr = new int[m + 1];
            // Base case
            for(int r = 0; r <= m; r++) {
                prev[r] = 1;
            }
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    int result = 0;
                    if(s.charAt(i - 1) == t.charAt(j - 1)) {
                        result = prev[j] + prev[j - 1];
                    } else {
                        result = prev[j];
                    }
                    curr[j] = result % MOD;
                }
                curr = prev;
            }
            return curr[n];
        }
    }*/
}
