package com.zakcorp.striver_series.dp;

public class DP_8
{
  /*
  Ninja's Training
   */
  static class Solver1 {
    // Recursive approach
    public int uniquePaths(int m, int n) {
      return findUniquePaths(m - 1, n - 1);
    }

    private int findUniquePaths(int r, int c) {
      if(r == 0 && c == 0)
        return 1;
      if(r < 0 || c < 0)
        return 0;
      int up = findUniquePaths( r - 1, c );
      int left = findUniquePaths( r, c - 1);

      return up + left;
    }
  }
  static class Solver2 {
    // Memoization approach
    public int uniquePaths(int m, int n) {
      int[][] memo = new int[m][n];
      return findUniquePaths(m - 1, n - 1, memo);
    }

    private int findUniquePaths(int r, int c, int[][] memo) {
      if(r == 0 && c == 0)
        return 1;
      if(r < 0 || c < 0)
        return 0;
      if(memo[r][c] != 0)
        return memo[r][c];
      int up = findUniquePaths( r - 1, c , memo);
      int left = findUniquePaths( r, c - 1, memo);
      memo[r][c] = up + left;
      return memo[r][c];
    }
  }
}
