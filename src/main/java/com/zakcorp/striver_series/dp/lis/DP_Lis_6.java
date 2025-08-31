package com.zakcorp.striver_series.dp.lis;

import java.util.Arrays;
import java.util.Comparator;

public class DP_Lis_6 {
    static class Tabulation {
        public int solve1(int[] arr) {
            int n = arr.length;
            int[] dp = new int[n];
            Arrays.fill(dp, 1);

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < i; j++) {
                    if(arr[i] > arr[j] && dp[i] < 1 + dp[j]) {
                        dp[i] = 1 + dp[j];
                    }
                }
            }

            int maxVal = 1;
            for(int i = 0; i < n; i++) {
                maxVal = Math.max(maxVal, dp[i]);
            }

            int occurrences = 0;
            for(int i = 0; i < n; i++) {
                if(dp[i] == maxVal) {
                    occurrences++;
                }
            }
            return occurrences;
        }
    }
}
