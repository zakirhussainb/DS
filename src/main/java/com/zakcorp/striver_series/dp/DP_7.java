package com.zakcorp.striver_series.dp;

public class DP_7
{
  /*
  Ninja's Training
   */
  static class Solver1 {
    // Recursive approach
    public int maximumPoints(int[][] points) {
      int days = points.length;
      int lastPerformedTask = 3;
      return maximumPoints( points, days - 1, lastPerformedTask );
    }
    private int maximumPoints(int[][] points, int days, int lastPerformedTask) {
      if(days == 0) {
        int maxPoint = 0;
        for(int i = 0; i < 3; i++) {
          if(i != lastPerformedTask) {
            maxPoint = Math.max( maxPoint, points[days][i] );
          }
        }
        return maxPoint;
      }
      int maxPoint = 0;
      for(int i = 0; i < 3; i++) {
        if(i != lastPerformedTask) {
          int point = points[days][i] + maximumPoints( points, days - 1, i );
          maxPoint = Math.max( maxPoint, point );
        }
      }
      return maxPoint;
    }
  }

  static class Solver2 {
    // Memoization Approach
    public int maximumPoints(int[][] points) {
      int days = points.length;
      int lastPerformedTask = 3;
      int[][] dp = new int[days][lastPerformedTask + 1];
      maximumPoints( points, days - 1, lastPerformedTask, dp );
      return dp[days - 1][lastPerformedTask];
    }

    private int maximumPoints( int[][] points, int days, int lastPerformedTask, int[][] dp ) {
      if(days == 0) {
        int maxPoint = 0;
        for(int i = 0; i < 3; i++) {
          if(i != lastPerformedTask) {
            maxPoint = Math.max( maxPoint, points[days][i] );
          }
        }
        dp[days][lastPerformedTask] = maxPoint;
        return maxPoint;
      }

      if(dp[days][lastPerformedTask] != 0) {
        return dp[days][lastPerformedTask];
      }

      int maxPoint = 0;
      for(int i = 0; i < 3; i++) {
        if(i != lastPerformedTask) {
          int point = points[days][i] + maximumPoints( points, days - 1, i, dp );
          maxPoint = Math.max( maxPoint, point );
        }
      }
      dp[days][lastPerformedTask] = maxPoint;
      return maxPoint;
    }
  }

  static class Solver3 {
    // Tabulation Approach
    public int maximumPoints(int[][] points) {
      int days = points.length;
      int lastPerformedTask = 3;
      int[][] dp = new int[days][lastPerformedTask + 1];
      dp[0][0] = Math.max( points[0][1], points[0][2] );
      dp[0][1] = Math.max( points[0][0], points[0][2] );
      dp[0][2] = Math.max( points[0][0], points[0][1] );
      dp[0][3] = Math.max( points[0][0], Math.max( points[0][1], points[0][2] ) );

      for(int day = 1; day < days; day++) {
        for(int lastTask = 0; lastTask < 4; lastTask++) {
          dp[day][lastTask] = 0;
          for(int task = 0; task <= 2; task++) {
            if(task != lastTask) {
              int point = points[day][task] + dp[day - 1][task];
              dp[day][lastTask] = Math.max( dp[day][lastTask], point );
            }
          }
        }
      }
      return dp[days - 1][3];
    }
  }

  static class Solver4 {
    // Space Optimization Approach
    public int maximumPoints(int[][] points) {
      int days = points.length;
      int lastPerformedTask = 3;
      int[] prev = new int[lastPerformedTask + 1];
      prev[0] = Math.max( points[0][1], points[0][2] );
      prev[1] = Math.max( points[0][0], points[0][2] );
      prev[2] = Math.max( points[0][0], points[0][1] );
      prev[3] = Math.max( points[0][0], Math.max( points[0][1], points[0][2] ) );

      for(int day = 1; day < days; day++) {
        int[] temp = new int[4];
        for(int lastTask = 0; lastTask < 4; lastTask++) {
          temp[lastTask] = 0;
          for(int task = 0; task <= 2; task++) {
            if(task != lastTask) {
              int point = points[day][task] + prev[task];
              temp[lastTask] = Math.max( temp[lastTask], point );
            }
          }
        }
        prev = temp;
      }
      return prev[3];
    }

  }
}
