package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_7 {
    static class Recursion {
        public int solve1(int[] coins, int amount) {
            int n = coins.length;
            int result = recur(n - 1, coins, amount);
            return result >= (int)1e9 ? -1 : result;
        }
        private int recur(int ind, int[] coins, int amount) {
            if(ind == 0) {
                if(amount % coins[ind] == 0) {
                    return amount / coins[ind];
                }
                return (int)1e9;
            }

            int notPick = recur(ind - 1, coins, amount);

            int pick = (int)1e9;
            if(coins[ind] <= amount) {
                pick = 1 + recur(ind, coins, amount - coins[ind]);
            }

            return Math.min(pick, notPick);
        }
    }

    static class Memoization {
        public int solve1(int[] coins, int amount) {
            int n = coins.length;
            int[][] memo = new int[n][amount + 1];
            for(int i = 0; i < n; i++) {
                Arrays.fill(memo[i], -1);
            }
            int result = memoized(n - 1, coins, amount, memo);
            return result >= (int)1e9 ? -1 : result;
        }
        private int memoized(int ind, int[] coins, int amount, int[][] memo) {
            if(ind == 0) {
                if(amount % coins[ind] == 0) {
                    return amount / coins[ind];
                }
                return (int)1e9;
            }

            if(memo[ind][amount] != -1) {
                return memo[ind][amount];
            }

            int notPick = memoized(ind - 1, coins, amount, memo);

            int pick = (int)1e9;
            if(coins[ind] <= amount) {
                pick = 1 + memoized(ind, coins, amount - coins[ind], memo);
            }

            memo[ind][amount] = Math.min(pick, notPick);

            return memo[ind][amount];
        }
    }
}
