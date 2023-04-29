package com.zakcorp.striver_series.dp;

public class DP_9
{
  /*
  Unique Paths II
   */
  static class Solver1 {
    // Recursive approach
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int m = obstacleGrid.length;
      int n = obstacleGrid[0].length;
      return findUniquePathsWithObstacles(m - 1, n - 1, obstacleGrid);
    }

    private int findUniquePathsWithObstacles(int r, int c, int[][] obstacleGrid) {
      if(r >= 0 && c >= 0 && obstacleGrid[r][c] == 1)
        return 0;
      if(r == 0 && c == 0)
        return 1;
      if(r < 0 || c < 0)
        return 0;
      int up = findUniquePathsWithObstacles( r - 1, c, obstacleGrid );
      int left = findUniquePathsWithObstacles( r, c - 1, obstacleGrid);

      return up + left;
    }
  }

  static class Solver2 {
    // Memoization approach
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int m = obstacleGrid.length;
      int n = obstacleGrid[0].length;
      int[][] memo = new int[m][n];
      return findUniquePathsWithObstacles(m - 1, n - 1, obstacleGrid, memo);
    }

    private int findUniquePathsWithObstacles(int r, int c, int[][] obstacleGrid, int[][] memo) {
      if(r >= 0 && c >= 0 && obstacleGrid[r][c] == 1)
        return 0;
      if(r == 0 && c == 0)
        return 1;
      if(r < 0 || c < 0)
        return 0;

      if(memo[r][c] != 0)
        return memo[r][c];
      int up = findUniquePathsWithObstacles( r - 1, c, obstacleGrid, memo );
      int left = findUniquePathsWithObstacles( r, c - 1, obstacleGrid, memo);

      memo[r][c] = up + left;

      return memo[r][c];
    }
  }

}
