package com.zakcorp.striver_series.dp;

import java.util.List;

public class DP_12
{
  /*
  Leetcode-931 : Minimum Falling Path Sum
  Sol:-
    1. Express the recurrence in terms of indexes, 2D so (r, c) -> rows and columns
    2. Explore all the possible paths
    3. Take the minimum path
   */
  static class Solver1 {
    // Recursive approach
    public int minimumTotal(int[][] matrix) {
      int minP = Integer.MAX_VALUE;
      for(int c = 0; c < matrix[0].length; c++)
        minP = Math.min( minP, findMinFallingPathSum( 0, c, matrix ) );
      return minP;
    }
    private int findMinFallingPathSum(int r, int c, int[][] matrix) {
      if(r >= matrix.length || r < 0 || c >= matrix[0].length || c < 0)
        return Integer.MAX_VALUE;

      if(r == matrix.length - 1)
        return matrix[r][c];

      int down = findMinFallingPathSum( r + 1, c, matrix );
      int leftDiag = findMinFallingPathSum( r + 1, c - 1, matrix );
      int rightDiag = findMinFallingPathSum( r + 1, c + 1, matrix );

      return matrix[r][c] + Math.min(down, Math.min( leftDiag, rightDiag));
    }
  }

  static class Solver2 {
    // Memoization approach
    public int minimumTotal(int[][] matrix) {
      int minP = Integer.MAX_VALUE;
      int m = matrix.length;
      int n = matrix[0].length;
      int[][] memo = new int[m][n];
      for(int c = 0; c < matrix[0].length; c++)
        minP = Math.min( minP, findMinFallingPathSum( 0, c, matrix, memo ) );
      return minP;
    }
    private int findMinFallingPathSum(int r, int c, int[][] matrix, int[][] memo) {
      if(r >= matrix.length || r < 0 || c >= matrix[0].length || c < 0)
        return Integer.MAX_VALUE;

      if(r == matrix.length - 1)
        return matrix[r][c];

      if(memo[r][c] != 0)
        return memo[r][c];

      int down = findMinFallingPathSum( r + 1, c, matrix, memo );
      int leftDiag = findMinFallingPathSum( r + 1, c - 1, matrix, memo );
      int rightDiag = findMinFallingPathSum( r + 1, c + 1, matrix, memo );

      memo[r][c] = matrix[r][c] + Math.min(down, Math.min( leftDiag, rightDiag));

      return memo[r][c];
    }
  }
}
