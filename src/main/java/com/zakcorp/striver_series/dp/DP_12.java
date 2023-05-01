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
}
