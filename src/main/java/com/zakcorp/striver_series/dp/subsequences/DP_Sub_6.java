package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_6 {
    static class Recursion {
        public int solve1(int[] wt, int[] val, int n, int W) {
            return recur(n - 1, W, wt, val);
        }
        private int recur(int ind, int W, int[] wt, int[] val) {
            if(ind < 0 || W < 0) {
                return 0;
            }

            int notPick = recur(ind - 1, W, wt, val);
            int pick = 0;
            if(W >= wt[ind])
                pick = recur(ind - 1, W - wt[ind], wt, val) + val[ind];

            return Math.max(pick, notPick);
        }
    }

    static class Memoization {
        public int solve1(int[] wt, int[] val, int n, int W) {
            int[][] memo = new int[n][W + 1];
            for(int i = 0; i < n; i++)
                Arrays.fill(memo[i], -1);
            return memoized(n - 1, W, wt, val, memo);
        }
        private int memoized(int ind, int W, int[] wt, int[] val, int[][] memo) {
            if(ind < 0 || W < 0) {
                return 0;
            }

            if(memo[ind][W] != -1) {
                return memo[ind][W];
            }

            int notPick = memoized(ind - 1, W, wt, val, memo);
            int pick = 0;
            if(W >= wt[ind])
                pick = memoized(ind - 1, W - wt[ind], wt, val, memo) + val[ind];

            memo[ind][W] = Math.max(pick, notPick);

            return memo[ind][W];
        }
    }
}
