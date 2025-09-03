package com.zakcorp.striver_series.dp.strings;

public class DP_Strings_3 {

    static class Tabulation {
        public int solve1(String str1) {
            StringBuilder sb = new StringBuilder(str1);
            String str2 = sb.reverse().toString();

            int m = str1.length(), n = str2.length();
            int[][] dp = new int[m + 1][n + 1];
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            return dp[m][n];
        }
    }

    static class SpaceOptimization {
        public int solve1(String str1) {
            StringBuilder sb = new StringBuilder(str1);
            String str2 = sb.reverse().toString();

            int m = str1.length(), n = str2.length();
            int[] prev = new int[n + 1];
            int[] curr = new int[n + 1];

            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        curr[j] = 1 + prev[j - 1];
                    } else {
                        curr[j] = Math.max(prev[j], curr[j - 1]);
                    }
                }
                System.arraycopy(curr, 0, prev, 0, n + 1);
            }

            return curr[n];
        }
    }
}
