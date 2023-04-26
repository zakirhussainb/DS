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
}
