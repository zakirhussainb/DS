package com.zakcorp.striver_series.dp.strings;

import java.util.Arrays;

public class DP_Strings_1 {
    static class Recursion {
        public int solve1(String str1, String str2) {
            int m = str1.length();
            int n = str2.length();
            return recur(m - 1, n - 1, str1, str2);
        }
        private int recur(int ind1, int ind2, String str1, String str2) {
            if(ind1 < 0 || ind2 < 0) {
                return 0;
            }
            if(str1.charAt(ind1) == str2.charAt(ind2)) {
                return 1 + recur(ind1 - 1, ind2 - 1, str1, str2);
            }
            return Math.max(recur(ind1 - 1, ind2, str1, str2), recur(ind1, ind2 - 1, str1, str2));
        }
    }

    static class Memoization {
        public int solve1(String str1, String str2) {
            int m = str1.length();
            int n = str2.length();

            int[][] memo = new int[m][n];
            for(int i = 0; i < m; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(m - 1, n - 1, str1, str2, memo);
        }
        private int memoized(int ind1, int ind2, String str1, String str2, int[][] memo) {
            if(ind1 < 0 || ind2 < 0) {
                return 0;
            }

            if(memo[ind1][ind2] != -1) {
                return memo[ind1][ind2];
            }

            if(str1.charAt(ind1) == str2.charAt(ind2)) {
                return 1 + memoized(ind1 - 1, ind2 - 1, str1, str2, memo);
            }
            memo[ind1][ind2] = Math.max(memoized(ind1 - 1, ind2, str1, str2, memo), memoized(ind1, ind2 - 1, str1, str2, memo));

            return memo[ind1][ind2];
        }
    }
}
