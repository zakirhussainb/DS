package com.zakcorp.leetcodemaster;

public class Problem_509 {
    static class Solver {
        // Using recursion
        public int solve1(int n) {
            if(n == 0)
                return 0;
            if(n == 1)
                return 1;
            return solve1(n - 1) + solve1(n - 2);
        }
        // Using DP Tabulation Method
        public int solve2(int n) {
            if(n == 0)
                return 0;
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for(int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
        // Using Space Optimized DP -> without an additional array
        public int solve3(int n) {
            if(n == 0)
                return 0;
            if(n == 1)
                return 1;
            int n1 = 0, n2 = 1;
            int n3 = 0;
            for(int i = 2; i <= n; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            return n3;
        }
    }
}
