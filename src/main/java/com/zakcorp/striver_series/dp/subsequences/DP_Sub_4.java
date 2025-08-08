package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_4 {

    private static final int MOD = 1000_000_007;
    static class Recursion {
        public int solve1(int[] arr, int K) {
            return recur(arr.length - 1,arr, K);
        }
        private int recur(int ind, int[] arr, int K) {
            if(K == 0) {
                return 1;
            }

            if(ind == 0) {
                return arr[0] == K ? 1 : 0;
            }

            int pick = 0;
            if(arr[ind] <= K) {
                pick = recur(ind - 1, arr, K - arr[ind]);
            }
            int notPick = recur(ind - 1, arr, K);

            return pick + notPick;
        }
    }

    static class Memoization {
        public int solve1(int[] arr, int K) {
            int[][] memo = new int[arr.length][K + 1];
            for(int i = 0; i < arr.length; i++){
                Arrays.fill(memo[i], -1);
            }
            return memoized(arr.length - 1,arr, K, memo);
        }
        private int memoized(int ind, int[] arr, int K, int[][] memo) {
            if(K == 0) {
                return 1;
            }

            if(ind == 0) {
                return arr[0] == K ? 1 : 0;
            }

            if(memo[ind][K] != -1) {
                return memo[ind][K];
            }

            int pick = 0;
            if(arr[ind] <= K) {
                pick = memoized(ind - 1, arr, K - arr[ind], memo);
            }

            int notPick = memoized(ind - 1, arr, K, memo);

            memo[ind][K] = (pick + notPick) % MOD;

            return memo[ind][K];
        }
    }

    static class Tabulation {
        public int solve1(int[] arr, int K) {
            int n = arr.length;
            int[][] dp = new int[n][K + 1];
            for(int i = 0; i < n; i++) {
                dp[i][0] = 1;
            }
            if(arr[0] <= K) {
                dp[0][arr[0]] = 1;
            }
            for(int ind = 1; ind < n; ind++) {
                for(int s = 0; s <= K; s++) {
                    int pick = 0;
                    if(arr[ind] <= s) {
                        pick = dp[ind - 1][s - arr[ind]];
                    }

                    int notPick = dp[ind - 1][s];

                    dp[ind][s] = (pick + notPick) % MOD;
                }
            }
            return dp[n - 1][K];
        }
    }
}
