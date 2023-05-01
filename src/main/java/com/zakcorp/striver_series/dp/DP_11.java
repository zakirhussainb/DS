package com.zakcorp.striver_series.dp;

import java.util.*;

public class DP_11
{
  /*
  Leetcode-120 : Triangle
  Minimum Path Sum in Triangular Grid
  Sol:-
    1. Express the recurrence in terms of indexes, 2D so (r, c) -> rows and columns
    2. Explore all the possible paths
    3. Take the minimum path
   */
  static class Solver1 {
    // Recursive approach
    public int minimumTotal(List<List<Integer>> triangle) {
      return findMinPathSum( 0, 0, triangle );
    }
    private int findMinPathSum(int r, int c, List<List<Integer>> triangle) {
      if(r == triangle.size() - 1)
        return triangle.get( r ).get( c );

      int down = findMinPathSum( r + 1, c, triangle );
      int diag = findMinPathSum( r + 1, c + 1, triangle );

      return triangle.get( r ).get( c ) + Math.min( down, diag );
    }
  }

  static class Solver2 {
    // Memoization Approach
    public int minimumTotal(List<List<Integer>> triangle) {
      int[][] memo = new int[triangle.size()][triangle.size()];
      return findMinPathSum( 0, 0, triangle, memo );
    }
    private int findMinPathSum(int r, int c, List<List<Integer>> triangle, int[][] memo) {
      if(r == triangle.size() - 1)
        return triangle.get( r ).get( c );

      if(memo[r][c] != 0)
        return memo[r][c];

      int down = findMinPathSum( r + 1, c, triangle, memo );
      int diag = findMinPathSum( r + 1, c + 1, triangle, memo );
      memo[r][c] = triangle.get( r ).get( c ) + Math.min( down, diag );
      return memo[r][c];
    }
  }

  static class Solver3 {
    // Tabulation Approach
    public int minimumTotal(List<List<Integer>> triangle) {
      int m = triangle.size();
      int[][] dp = new int[m][m];
      for(int c = 0; c < m; c++) {
        dp[m - 1][c] = triangle.get( m - 1 ).get( c );
      }

      for(int r = m - 2; r >= 0; r--) {
        for(int c = r; c >= 0; c--) {
          int down = dp[r + 1][c];
          int diag = dp[r + 1][c + 1];

          dp[r][c] = triangle.get( r ).get( c ) + Math.min(down, diag);
        }
      }

      return dp[0][0];
    }
  }

  static class Solver4 {
    // Space Optimization Approach
    public int minimumTotal(List<List<Integer>> triangle) {
      int m = triangle.size();
      int[] frontRow = new int[m];
      for(int c = 0; c < m; c++)
        frontRow[c] = triangle.get( m - 1 ).get( c );

      for(int r = m - 2; r >= 0; r--) {
        int[] curr = new int[m];
        for(int c = r; c >= 0; c--) {
          int down = frontRow[c];
          int diag = frontRow[c + 1];
          curr[c] = triangle.get( r ).get( c ) + Math.min(down, diag);
        }
        frontRow = curr;
      }
      return frontRow[0];
    }
  }
}
