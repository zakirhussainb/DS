package com.zakcorp.leetcodemaster;

public class Problem_1137 {
    static class Solver {
        // Using recursion -> slow for larger inputs
        public int tribonacci1(int n) {
            if(n == 0) {
                return 0;
            }
            if(n == 1 || n == 2) {
                return 1;
            }
            return tribonacci1(n - 1) + tribonacci1(n - 2) + tribonacci1(n - 3);
        }

        // Using Tabulation DP with space
        public int tribonacci2(int n) {
            if(n == 0) {
                return 0;
            }
            if(n == 1 || n == 2) {
                return 1;
            }
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            for(int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            return dp[n];
        }

        // Using space optimized DP without additional space
        public int tribonacci3(int n) {
            if(n == 0) {
                return 0;
            }
            if(n == 1 || n == 2) {
                return 1;
            }
            int n0 = 0, n1 = 1, n2 = 1;
            int n3 = 0;
            for(int i = 3; i <= n; i++) {
                n3 = n0 + n1 + n2;
                n0 = n1;
                n1 = n2;
                n2 = n3;
            }
            return n3;
        }
    }
}
