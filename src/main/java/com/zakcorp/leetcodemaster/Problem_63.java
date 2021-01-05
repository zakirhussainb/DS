package com.zakcorp.leetcodemaster;

public class Problem_63 {
    // Good Solution but Brute Force, so TLE
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
}
