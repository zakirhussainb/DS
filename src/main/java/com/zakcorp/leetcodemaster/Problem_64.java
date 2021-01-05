package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_64 {
    // Good Solution but Brute Force - Recursive , so TLE
    static class Solver {
        public int solve1(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            return recursive(m - 1, n - 1, grid);
        }
        private int recursive(int m, int n, int[][] grid) {
            if(m == 0 && n == 0) {
                return grid[m][n];
            }
            if(m == 0) {
                int sum = 0;
                for(int i = 0; i <= n; i++) {
                    sum += grid[0][i];
                }
                return sum;
            }
            if(n == 0) {
                int sum = 0;
                for(int i = 0; i <= m; i++) {
                    sum += grid[i][0];
                }
                return sum;
            }
            return Math.min( recursive(m, n - 1, grid) , recursive(m - 1, n, grid) ) + grid[m][n];
        }
    }
    // Good Solution Memoized DP, passed
    static class Solver1 {
        public int solve1(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] memo = new int[m][n];
            return memoized(m - 1, n - 1, grid, memo);
        }
        private int memoized(int m, int n, int[][] grid, int[][] memo) {
            if(memo[m][n] != 0) {
                return memo[m][n];
            }
            if(m == 0 && n == 0) {
                return grid[m][n];
            }
            if(m == 0) {
                int sum = 0;
                for(int i = 0; i <= n; i++) {
                    sum += grid[0][i];
                }
                return sum;
            }
            if(n == 0) {
                int sum = 0;
                for(int i = 0; i <= m; i++) {
                    sum += grid[i][0];
                }
                return sum;
            }
            memo[m][n] = Math.min( memoized(m, n - 1, grid, memo) , memoized(m - 1, n, grid, memo) ) + grid[m][n];
            return memo[m][n];
        }
    }
}
