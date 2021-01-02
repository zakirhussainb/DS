package com.zakcorp.leetcodemaster;

public class Problem_62 {
    static class Solver { // Time: O(2 ^ (m+n)); Space: O(m + n)
        public int gridRecursive(int m, int n) {
            if(m == 1 || n == 1) {
                return 1;
            }
            return gridRecursive(m, n - 1) + gridRecursive(m - 1, n);
        }
    }
    static class Solver1 { // Time: O(m * n); Space: O(m + n)
        public int gridMemoized(int m, int n) {
            int[][] memo = new int[m + 1][n + 1];
            return gridSol(m, n, memo);
        }
        private int gridSol(int m, int n, int[][] memo) {
            if(memo[m][n] != 0) {
                return memo[m][n];
            }
            if(m == 1 || n == 1) {
                return 1;
            }
            memo[m][n] = gridSol(m, n - 1, memo) + gridSol(m - 1, n, memo);
            return memo[m][n];
        }
    }
    static class Solver2 { // Time: O(m * n); Space: O(m + n)
        public int gridTabulation(int m, int n) {
            int[][] dp = new int[m + 1][n + 1];
            dp[1][1] = 1;
            for(int i = 1; i <= m; i++) {
                for(int j = 1; j <= n; j++) {
                    int curr = dp[i][j];
                    if(i + 1 <= m) {
                        dp[i + 1][j] += curr;
                    }
                    if(j + 1 <= n) {
                        dp[i][j + 1] += curr;
                    }
                }
            }
            return dp[m][n];
        }
    }
}
