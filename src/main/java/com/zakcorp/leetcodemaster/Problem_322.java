package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_322 {
    // Tabulation DP -> Bottom UP DP
    static class Solver1 {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount + 1];
            Arrays.fill(dp, amount + 1);
            dp[0] = 0;
            for(int i = 1; i <= amount; i++) {
                for(int c : coins) {
                    if(i - c >= 0) {
                        dp[i] = Math.min(dp[i], 1 + dp[i - c]);
                    }
                }
            }
            return dp[amount] == amount + 1 ? -1 : dp[amount];
        }
    }
}
