package com.zakcorp.final450.dp;

public class P_383 {
    /*
    Catalan Number
        Youtube resources to understand the solution
        https://youtu.be/0pTN0qzpt-Y
        https://youtu.be/0s20L4-chDA
     */
    static class Solver {
        // Recursive solution - Time - Exponential
        public int solve1(int n) {
            if(n <= 1)
                return 1;
            int res = 0;
            for(int i = 0; i < n; i++) {
                res += solve1(i) * solve1(n - i - 1);
            }
            return res;
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
        public int solve3(int n) {
            // Based on formula - 2nCn / n + 1
            long cn = binomialCoefficient(2 * n, n);
            return (int) (cn / (n + 1));
        }
        private long binomialCoefficient(int n, int r) {
            long[] factDp = new long[n + 1];
            factDp[0] = 1;
            for(int i = 1; i <= n; i++) {
                factDp[i] = i * factDp[i - 1];
            }
            long nF = factDp[n];
            long nrF = factDp[n - r];
            long rF = factDp[r];
            return nF / (nrF * rF);
        }
    }
}
