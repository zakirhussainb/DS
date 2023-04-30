package com.zakcorp.striver_series.dp;

import java.util.List;

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
}
