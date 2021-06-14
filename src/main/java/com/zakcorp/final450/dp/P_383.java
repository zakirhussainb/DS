package com.zakcorp.final450.dp;

public class P_383 {
    /*
    Catalan Number

     */
    static class Solver {
        // Recursive solution - Time - Exponential
        public int solve1() {
            return 0;
        }

        // Tabulation DP - Time - Quadratic - O(N^2)
        public int solve2(int n) {
            int[] catalanDP = new int[n + 1];
            catalanDP[0] = 1; catalanDP[1] = 1;
            for(int i = 2; i <= n; i++) {
                for(int j = 0; j < i; j++) {
                    catalanDP[i] += catalanDP[j] * catalanDP[i - j - 1];
                }
            }
            return catalanDP[n];
        }

        // Using Binomial Coefficient - Time - Linear - O(N)
        public int solve3() {
            return 0;
        }
    }
}
