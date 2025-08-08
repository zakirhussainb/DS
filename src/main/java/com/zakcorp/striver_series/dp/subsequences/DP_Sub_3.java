package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_3 {
    static class Tabulation {
        public int solve1(int[] arr) {
            int n = arr.length;

            int totalSum = 0;
            for(int num : arr)
                totalSum += num;

            int target = totalSum;

            int[][] dp = new int[n][target + 1];
            // Base case, target = 0
            for(int i = 0; i < n; i++) {
                dp[i][0] = 1;
            }

            if (arr[0] <= target) {
                dp[0][arr[0]] = 1;
            }

            for(int i = 1; i < n; i++) {
                for(int t = 1; t <= target; t++) {
                    boolean pick = false;
                    if (arr[i] <= t) {
                        pick = dp[i - 1][t - arr[i]] == 1;
                    }
                    boolean notPick = dp[i - 1][t] == 1;

                    dp[i][t] = pick || notPick ? 1 : 0;
                }
            }

            int minVal = Integer.MAX_VALUE;
            for(int s1 = 0; s1 <= totalSum / 2; s1++) {
                if(dp[n - 1][s1] == 1) {
                    int s2 = totalSum - s1;
                    minVal = Math.min(minVal, Math.abs(s2 - s1));
                }
            }
            return minVal;
        }
    }
}
