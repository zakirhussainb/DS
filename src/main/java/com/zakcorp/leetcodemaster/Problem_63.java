package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_63 {
    // Good Solution but Brute Force - Recursive , so TLE
    static class Solver {
        public int solve1(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            return recursive(m - 1, n - 1, obstacleGrid);
        }
        private int recursive(int m, int n, int[][] obstacleGrid) {
            if(m < 0 || n < 0) {
                return 0;
            }
            if(m == 0 && n == 0 && obstacleGrid[m][n] != 1) {
                return 1;
            }
            int res = 0;
            if(obstacleGrid[m][n] != 1) {
                res = recursive(m, n - 1, obstacleGrid) + recursive(m - 1, n, obstacleGrid);
            }
            return res;
        }
    }

    // Good Solution Memoized DP, passed
    static class Solver1 {
        public int solve1(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] memo = new int[m][n];
            for(int[] kl : memo) {
                Arrays.fill(kl, -1);
            }
            return memoized(m - 1, n - 1, obstacleGrid, memo);
        }
        private int memoized(int m, int n, int[][] grid, int[][] memo) {
            if(m < 0 || n < 0) {
                return 0;
            }
            if(memo[m][n] != -1) {
                return memo[m][n];
            }
            if(m == 0 && n == 0 && grid[m][n] != 1) {
                return 1;
            }
            int res = 0;
            if(grid[m][n] != 1) {
                res = memoized(m, n - 1, grid, memo) + memoized(m - 1, n, grid, memo);
            }
            memo[m][n] = res;
            return res;
        }
    }

    //
    static class Solver2 {
        public int solve1(int[][] obstacleGrid) {
            return 0;
        }
    }
}
