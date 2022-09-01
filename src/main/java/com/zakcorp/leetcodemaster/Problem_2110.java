package com.zakcorp.leetcodemaster;

public class Problem_2110
{
    static class Solver {
        public long solve1(int[] prices) {
            int n = prices.length;
            long[] dp = new long[n];
            dp[0] = 1;
            long ans = 1;
            for(int i = 1; i < n; i++) {
                if(prices[i - 1] - 1 == prices[i]) {
                    dp[i] = dp[i - 1] + 1;
                } else {
                    dp[i] = 1;
                }
                ans += dp[i];
            }
            return ans;
        }
        public long solve2(int[] prices) {
            int n = prices.length;
            long dp = 1;
            long ans = 1;
            for(int i = 1; i < n; i++) {
                if(prices[i - 1] - 1 == prices[i]) {
                    dp += 1;
                } else {
                    dp = 1;
                }
                ans += dp;
            }
            return ans;
        }
    }
}
