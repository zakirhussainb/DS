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
}
