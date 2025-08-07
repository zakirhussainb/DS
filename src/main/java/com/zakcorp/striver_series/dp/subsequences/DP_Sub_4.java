package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_4 {

    private static final int MOD = 1000_000_007;
    static class Recursion {
        public int solve1(int[] arr, int K) {
            return recur(arr.length - 1, 0, arr, K);
        }
        private int recur(int ind, int sum, int[] arr, int K) {
            if(sum == K) {
                return 1;
            }

            if(ind < 0 || sum > K) {
                return 0;
            }

            int pick = recur(ind - 1, sum + arr[ind], arr, K);
            int notPick = recur(ind - 1, sum, arr, K);

            return pick + notPick;
        }
    }

    static class Memoization {
        public int solve1(int[] arr, int K) {
            int[][] memo = new int[arr.length][K];
            for(int i = 0; i < arr.length; i++){
                Arrays.fill(memo[i], -1);
            }
            return memoized(arr.length - 1, 0, arr, K, memo);
        }
        private int memoized(int ind, int sum, int[] arr, int K, int[][] memo) {
            if(sum == K) {
                return 1;
            }

            if(ind < 0 || sum > K) {
                return 0;
            }

            if(memo[ind][sum] != -1) {
                return memo[ind][sum];
            }

            int pick = memoized(ind - 1, sum + arr[ind], arr, K, memo);
            int notPick = memoized(ind - 1, sum, arr, K, memo);

            memo[ind][sum] = (pick + notPick) % MOD;

            return memo[ind][sum];
        }
    }
}
