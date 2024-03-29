package com.zakcorp.leetcodemaster;

public class Problem_746 {
    static class Solver {
        public int solve1(int[] cost) {
            int f1 = 0, f2 = 0;
            for (int i = cost.length - 1; i >= 0; --i) {
                int f0 = cost[i] + Math.min(f1, f2);
                f2 = f1;
                f1 = f0;
            }
            return Math.min(f1, f2);
        }
    }
    static class Solver1 {
        public int solve1(int[] cost) {
            return Math.min( recursive(0, cost), recursive(1, cost) );
        }
        private int recursive(int n, int[] cost) {
            if(n >= cost.length) {
                return 0;
            }
            if(n == cost.length - 1) {
                return cost[n];
            }
            return Math.min( recursive(n + 1, cost) , recursive(n + 2, cost) ) + cost[n];
        }
    }
    static class Solver2 {
        public int solve1(int[] cost) {
            int n = cost.length;
            int[] memo = new int[n + 1];
            return Math.min( memoized(0, cost, memo), memoized(1, cost, memo) );
        }
        private int memoized(int n, int[] cost, int[] memo) {
            if(memo[n] != 0) {
                return memo[n];
            }
            if(n >= cost.length) {
                return 0;
            }
            if(n == cost.length - 1) {
                return cost[n];
            }
            memo[n] = Math.min(memoized(n + 1, cost, memo), memoized(n + 2, cost, memo) ) + cost[n];
            return memo[n];
        }
    }
    // Using Bottom-Up Dynamic Programming
    static class Solver3 {
        // Tabulation Method with O(n) extra space
        public int solve1(int[] cost) {
            int[] dp = new int[cost.length + 1];
            for(int i = 2; i < dp.length; i++) {
                int oneStep = dp[i - 1] + cost[i - 1];
                int twoStep = dp[i - 2] + cost[i - 2];
                dp[i] = Math.min(oneStep, twoStep);
            }
            return dp[cost.length];
        }
        // Constant space method O(1)
        public int solve2(int[] cost) {
            int oneStep = 0;
            int twoStep = 0;
            for(int i = 2; i <= cost.length; i++) {
                int temp = oneStep;
                oneStep = Math.min(oneStep + cost[i - 1], twoStep + cost[i - 2]);
                twoStep = temp;
            }
            return oneStep;
        }
    }
}
