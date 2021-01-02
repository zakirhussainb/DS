package com.zakcorp.dynamicprogramming;

/**
 * Created by Zakir Hussain B on 02/01/21.
 *
 * @source: Alvin's - https://youtu.be/oBt53YbR9Kk
 * @topic: Dynamic Programming
 * @sub-topic: Fibonacci Number
 * @platform:
 * @problem_link: Find the nth fibonacci number
 * @pseudocode:
 */
public class FibonacciNumber {
    static class Solver {
        public int recursive(int n) {
            if(n == 0)
                return 0;
            if(n == 1)
                return 1;
            return recursive(n - 1) + recursive(n - 2);
        }
    }
    static class Solver1 {
        public long memoized(int n) {
            return recursive(n, new long[n + 1]);
        }
        private long recursive(int n, long[] memo) {
            if(memo[n] != 0)
                return memo[n];
            if(n == 0)
                return 0;
            if(n == 1)
                return 1;
            memo[n] = recursive(n - 1, memo) + recursive(n - 2, memo);
            return memo[n];
        }
    }
    static class Solver2 {
        public long tabulation(int n) {
            long[] dp = new long[n + 1];
            dp[1] = 1;
            for(int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }
}