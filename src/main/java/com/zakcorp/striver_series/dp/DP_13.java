package com.zakcorp.striver_series.dp;

public class DP_13
{
  /*
  3D - DP Ninja and His Friends
  Sol:-
    1. Express the recurrence in terms of indexes, 2D so (r, c) -> rows and columns
    2. Explore all the possible paths
    3. Take the minimum path
   */
  static class Solver1 {
    // Recursive approach
    /*public int maximumTotal(int[][] matrix) {
      int r = 0, c1 = 0, c2 = matrix[0].length - 1;
      return findMaxPath(r, c1, c2, matrix);
    }
    private int findMaxPath(int r, int c1, int c2, int[][] matrix) {
      if(c1 >= matrix[0].length || c1 < 0 || c2 >= matrix[0].length || c2 < 0)
        return Integer.MIN_VALUE;

      if(r == matrix.length - 1) {
        if(c1 == c2)
          return matrix[r][c1];
        else
          return matrix[r][c1] + matrix[r][c2];
      } 
      int down = findMaxPath( r1 + 1, c1, r2 + 1, c2, matrix );
      int leftDiag = findMaxPath( r1 + 1, c1 - 1, r2 + 1, c2 - 1, matrix );
      int rightDiag = findMaxPath( r1 + 1, c1 + 1, r2 + 1, c2 + 1, matrix );

      final int max = Math.max( down, Math.max( leftDiag, rightDiag ) );
      int maxSum1 = matrix[r1][c1] + max;
      int maxSum2 = matrix[r2][c2] + max;
      
      return Math.max( maxSum1, maxSum2 );
    }*/
  }
}
