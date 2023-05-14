package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_17
{
  /*
  10 31
9 7 0 3 9 8 6 5 7 6
  Given an array arr[] of non-negative integers and an integer sum,
  the task is to count all subsets of the given array with a sum equal to a given sum.
  Note: Answer can be very large, so, output answer modulo 109+7
  NOTE:- The below solution will not work for negative integers.
  */
  /*
  This problem is similar to DP-14.
   */
  static class Solver1 {
    private static final int MODVAL = 1000_000_007;
    public int perfectSum(int[] arr, int sum) {
      int n = arr.length;
      return countAllSubsets(arr, n - 1,  sum);
    }
    private int countAllSubsets(int[] arr, int index, int sum) {
      if(sum == 0) {
        return 1;
      }
      if(index == 0) {
        return (arr[0] == sum) ? 1 : 0;
      }
      int notTake = countAllSubsets(arr, index - 1, sum);
      int take = 0;
      if(sum >= arr[index]) {
        take = countAllSubsets(arr, index - 1, sum - arr[index]) % MODVAL;
      }

      return (take + notTake) % MODVAL;
    }
  }

  static class Solver2 {
    private static final int MODVAL = 1000_000_007;
    public int perfectSum(int[] arr, int sum) {
      int n = arr.length;
      int[][] memo = new int[n][sum + 1];
      for(int[] row : memo)
        Arrays.fill( row, -1);
      return countAllSubsets(arr, n - 1,  sum, memo);
    }
    private int countAllSubsets(int[] arr, int index, int sum, int[][] memo) {
//      if(sum == 0) {
//        return 1;
//      }
      if(index == 0) {
        if(sum==0 && arr[index]==0) return 2;
        if(arr[index]==sum || sum==0) return 1;
        return 0;
      }
      if(memo[index][sum] != -1)
        return memo[index][sum];
      int notTake = countAllSubsets(arr, index - 1, sum, memo);
      int take = 0;
      if(sum >= arr[index]) {
        take = countAllSubsets(arr, index - 1, sum - arr[index], memo) % MODVAL;
      }

      memo[index][sum] = (take + notTake) % MODVAL;

      return memo[index][sum];
    }
  }

  static class Solver3 {

    private static final int MODVAL = 1000_000_007;
    public int perfectSum(int[] arr, int sum) {
      int n = arr.length;
      int[][] dp = new int[n + 1][sum + 1];
      dp[0][0] = 1;

      for(int i = 1; i <= n; i++)
        dp[i][0] = 1;

      for(int i = 1; i <= sum; i++) {
        dp[0][i] = 0;
      }

      for(int ind = 1; ind <= n; ind++) {
        for(int target = 1; target <= sum; target++) {
          int notTake = dp[ind - 1][target];
          int take = 0;
          if(target > arr[ind - 1]) {
            take = dp[ind - 1][target - arr[ind]];
          }
          dp[ind][target] = take + notTake;
        }
      }
      return dp[n][sum];
    }
  }
}
