package com.zakcorp.striver_series.dp.strings;

import java.util.Arrays;

public class DP_Strings_2 {

    static class Tabulation {
        public int solve1(String str1, String str2) {
            int m = str1.length(), n = str2.length();
            int[][] dp = new int[m + 1][n + 1];
            int maxVal = 0;
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                        maxVal = Math.max(maxVal, dp[i][j]);
                    }
                }
            }
            return maxVal;
        }
    }

    static class SpaceOptimization {
        public int solve1(String str1, String str2) {
            int m = str1.length(), n = str2.length();

            int[] prev = new int[n + 1];
            int[] curr = new int[n + 1];

            int maxVal = 0;
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        curr[j] = 1 + prev[j - 1];
                        maxVal = Math.max(maxVal, curr[j]);
                    }
                }
                System.arraycopy(curr, 0, prev, 0, m + 1);
            }
            return maxVal;
        }
    }
}
