package com.zakcorp.striver_series.dp.strings;

public class DP_Strings_6 {
    static class Tabulation {
        public String solve1(String str1, String str2) {
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

            StringBuilder ans = new StringBuilder();
            int i = m, j = n;
            while(i > 0 && j > 0) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    ans.append(str1.charAt(i - 1));
                    i--;
                    j--;
                } else if(dp[i - 1][j] > dp[i][j - 1]) {
                    ans.append(str1.charAt(i - 1));
                    i--;
                } else {
                    ans.append(str2.charAt(j - 1));
                    j--;
                }
            }

            while(i > 0) {
                ans.append(str1.charAt(i - 1));
                i--;
            }

            while(j > 0) {
                ans.append(str2.charAt(j - 1));
                j--;
            }

            return ans.reverse().toString();
        }
    }
}
