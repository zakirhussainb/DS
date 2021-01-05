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

    // Good Solution Memoized DP, passed - Alternative memoization solution
    static class Solver2 {
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
                return grid[m][n] + memoized(m, n - 1, grid, memo);
            }
            if(n == 0) {
                return grid[m][n] + memoized(m - 1, n, grid, memo);
            }
            memo[m][n] = Math.min( memoized(m, n - 1, grid, memo) , memoized(m - 1, n, grid, memo) ) + grid[m][n];
            return memo[m][n];
        }
    }
    // Good Solution Tabulation DP
    static class Solver3 {
        public int solve1(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if(i == m - 1 && j != n - 1)
                        grid[i][j] = grid[i][j] +  grid[i][j + 1];
                    else if(j == n - 1 && i != m - 1)
                        grid[i][j] = grid[i][j] + grid[i + 1][j];
                    else if(j != n - 1 && i != m - 1)
                        grid[i][j] = grid[i][j] + Math.min(grid[i + 1][j],grid[i][j + 1]);
                }
            }
            return grid[0][0];
        }
        public int solve2(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == 0 && j == 0) {
                        grid[i][j] = grid[i][j];
                    } else if(i == 0 && j != 0) {
                        grid[i][j] += grid[i][j - 1];
                    } else if(i != 0 && j == 0) {
                        grid[i][j] += grid[i - 1][j];
                    } else {
                        grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                    }
                }
            }
            return grid[m - 1][n - 1];
        }
    }
}
