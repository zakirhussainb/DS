package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_70 {
    static class Solver {
        // Brute Force - Recursive solution gives TLE when 'n' is 45
        public int solve1(int n) {
            if(n < 0) {
                return 0;
            }
            if(n == 0) {
                return 1;
            }
            return solve1(n - 1) + solve1(n - 2);
        }
    }
    static class Solver1 {
        // Efficient - Memoized solution passes when 'n' is 45
        public int solve1(int n) {
            int[] memo = new int[n + 1];
            return memoized(n, memo);
        }
        private int memoized(int n, int[] memo) {
            if(n < 0) {
                return 0;
            }
            if(memo[n] != 0) {
                return memo[n];
            }
            if(n == 0) {
                return 1;
            }
            memo[n] = memoized(n - 1, memo) + memoized(n - 2, memo);
            return memo[n];
        }
    }
    static class Solver2 {
        // Efficient - Tabulation DP passes when 'n' is 45
        public int solve1(int n) {
            int[] dp = new int[n + 1];
            dp[0] = 1;
            for(int i = 0; i < dp.length; i++) {
                int curr = dp[i];
                if(i + 1 < dp.length)
                    dp[i + 1] += curr;
                if(i + 2 < dp.length)
                    dp[i + 2] += curr;
            }
            return dp[n];
        }
    }
}
