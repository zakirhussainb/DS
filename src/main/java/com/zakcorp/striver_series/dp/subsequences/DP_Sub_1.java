package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_1 {
    static class Recursion {
        public boolean solve1(int[] arr, int target) {
            return recur(0, target, arr);
        }
        private boolean recur(int ind, int target, int[] arr) {
            if(target == 0) {
                return true;
            }
            if(ind >= arr.length || target < 0) {
                return false;
            }
            boolean pick = recur(ind + 1, target - arr[ind], arr);
            boolean notPick = recur(ind + 1, target, arr);

            return pick || notPick;
        }
    }

    static class Memoization {
        public boolean solve1(int[] arr, int target) {
            int[][] memo = new int[arr.length][target + 1];
            for(int i = 0; i < arr.length; i++) {
                Arrays.fill(memo[i], -1);
            }
            return memoized(0, target, arr, memo);
        }
        private boolean memoized(int ind, int target, int[] arr, int[][] memo) {
            if(target == 0) {
                return true;
            }
            if(ind >= arr.length || target < 0) {
                return false;
            }

            if(memo[ind][target] != -1) {
                return memo[ind][target] == 1;
            }

            boolean pick = memoized(ind + 1, target - arr[ind], arr, memo);
            boolean notPick = memoized(ind + 1, target, arr, memo);

            memo[ind][target] = pick || notPick ? 1 : 0;

            return pick || notPick;
        }
    }

    static class Tabulation {
        public boolean solve1(int[] arr, int target) {
            int n = arr.length;
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
            return dp[n - 1][target] == 1;
        }
    }
}
