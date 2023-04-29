package com.zakcorp.striver_series.dp;

public class DP_10
{
  /*
  Minimum Path Sum
  Sol:-
    1. Express the recurrence in terms of indexes, 2D so (r, c) -> rows and columns
    2. Explore all the possible paths
    3. Take the minimum path
   */
  static class Solver1 {
    // Recursive approach
    public int minPathSum(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      return findMinPathSum(m - 1, n - 1, grid);
    }
    private int findMinPathSum(int r, int c, int[][] grid) {
      if(r == 0 && c == 0) {
        return grid[r][c];
      }
      if(r < 0 || c < 0) {
        return Integer.MAX_VALUE;
      }
      int up = findMinPathSum( r - 1, c, grid );
      int left = findMinPathSum( r, c - 1, grid );
      return grid[r][c] + Math.min(up, left);
    }
  }

  static class Solver2 {
    // Memoization approach
    public int minPathSum(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      int[][] memo = new int[m][n];
      return findMinPathSum(m - 1, n - 1, grid, memo);
    }
    private int findMinPathSum(int r, int c, int[][] grid, int[][] memo) {
      if(r == 0 && c == 0) {
        return grid[r][c];
      }
      if(r < 0 || c < 0) {
        return Integer.MAX_VALUE;
      }
      if(memo[r][c] != 0)
        return memo[r][c];

      int up = findMinPathSum( r - 1, c, grid, memo );
      int left = findMinPathSum( r, c - 1, grid, memo );

      memo[r][c] = grid[r][c] + Math.min(up, left);

      return memo[r][c];
    }
  }

  static class Solver3 {
    // Tabulation approach
    public int minPathSum(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      int[][] dp = new int[m][n];
      for(int r = 0; r < m; r++) {
        for(int c = 0; c < n; c++) {
          if(r == 0 && c == 0) {
            dp[r][c] = grid[r][c];
          } else {
            int up = Integer.MAX_VALUE, left = Integer.MAX_VALUE;
            if(r > 0)
              up = dp[r - 1][c];
            if(c > 0)
              left = dp[r][c - 1];

            dp[r][c] = grid[r][c] + Math.min(up, left);
          }
        }
      }
      return dp[m - 1][n - 1];
    }
  }
}
