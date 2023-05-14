package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_16
{
  /*
  LC - 2035. Partition Array Into Two Arrays to Minimize Sum Difference - DP 16
  Given an array arr of size n containing non-negative integers, the task is to divide it
  into two sets S1 and S2 such that the absolute difference between their sums is minimum and find the minimum difference
  NOTE:- The below solution will not work for negative integers.
  */
  /*
  This problem is similar to DP-14.
  We can solve it using the tabulation method for that problem. That matrix will generate all the
  possible results for the target
   */
  static class Solver4 {
    public int minimumDifference(int[] arr) {
      int n = arr.length;
      int totSum = Arrays.stream( arr ).sum();
      boolean[][] dp = new boolean[n][totSum + 1];
      for(int i = 0; i < n; i++)
        dp[i][0] = true;

      if(arr[0] <= totSum)
        dp[0][totSum] = true;

      for(int ind = 1; ind < n; ind++) {
        for(int target = 1; target <= totSum; target++) {
          boolean notTake = dp[ind - 1][target];
          boolean take = false;
          if(target >= arr[ind]) {
            take = dp[ind - 1][target - arr[ind]];
          }
          dp[ind][target] = take || notTake;
        }
      }
      int minDiff = Integer.MAX_VALUE;
      for(int i = 0; i <= totSum; i++) {
        if(dp[n - 1][i]) {
          int s1 = i;
          int s2 = totSum - i;
          minDiff = Math.min( minDiff, Math.abs( s1 - s2 ) );
        }
      }
      return minDiff;
    }
  }
}
