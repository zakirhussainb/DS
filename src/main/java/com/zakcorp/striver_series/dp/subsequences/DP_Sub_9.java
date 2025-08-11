package com.zakcorp.striver_series.dp.subsequences;

import java.util.Arrays;

public class DP_Sub_9 {

    private static final int MOD = 1_000_000_007;
    static class Recursion {
        public int solve1(int[] coins, int amount) {
            int n = coins.length;
            return recur(n - 1, coins, amount);
        }
        private int recur(int ind, int[] coins, int amount) {
            if(ind == 0) {
                return (amount % coins[ind] == 0) ? 1 : 0;
            }

            int notPick = recur(ind - 1, coins, amount);
            int pick = 0;
            if(coins[ind] <= amount) {
                pick = recur(ind, coins, amount - coins[ind]);
            }
            return (pick + notPick) % MOD;
        }
    }

    static class Memoization {
        public int solve1(int[] coins, int amount) {
            int n = coins.length;
            int[][] memo = new int[n][amount + 1];
            for(int i = 0; i < n; i++)
                Arrays.fill(memo[i], -1);
            return memoized(n - 1, coins, amount, memo);
        }
        private int memoized(int ind, int[] coins, int amount, int[][] memo) {
            if(ind == 0) {
                return (amount % coins[ind] == 0) ? 1 : 0;
            }

            if(memo[ind][amount] != -1){
                return memo[ind][amount];
            }

            int notPick = memoized(ind - 1, coins, amount, memo);
            int pick = 0;
            if(coins[ind] <= amount) {
                pick = memoized(ind, coins, amount - coins[ind], memo);
            }

            memo[ind][amount] = (pick + notPick) % MOD;

            return memo[ind][amount];
        }
    }

    static class Tabulation {
        public int solve1(int[] coins, int amount) {
            int n = coins.length;
            int[][] dp = new int[n][amount + 1];
            for(int t = 0; t <= amount; t++) {
                if(t % coins[0] == 0) {
                    dp[0][t] = 1;
                } else {
                    dp[0][t] = 0;
                }
            }

            for(int ind = 1; ind < n; ind++) {
                for(int t = 0; t <= amount; t++) {
                    int notPick = dp[ind - 1][t];
                    int pick = 0;
                    if(coins[ind] <= t) {
                        pick = dp[ind][t - coins[ind]];
                    }

                    dp[ind][t] = (pick + notPick) % MOD;
                }
            }

            return dp[n - 1][amount];
        }
    }
}
