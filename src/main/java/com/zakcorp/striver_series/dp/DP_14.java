package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_14
{
  /*
  Subset sum equal to target (DP- 14)
  Given an array of non-negative integers, and a value sum,
  determine if there is a subset of the given set with sum equal to given sum.
  Recursive Sol:-
    1. Express the recurrence in terms of index and target
    2. Either take an index element or not take an index element
    3. Return either take or notTake
   */
  static class Solver1 {
    public boolean isSubsetSum(int[] arr, int sum) {
      return isSubsetSum(arr, sum, arr.length - 1);
    }
    private boolean isSubsetSum(int[] arr, int target, int index) {
      if(target == 0)
        return true;
      if(index == 0)
        return arr[index] == target;
      boolean take = false;
      if(target >= arr[index])
        take = isSubsetSum( arr, target - arr[index], index - 1 );
      boolean notTake = isSubsetSum( arr, target, index - 1 );

      return take || notTake;
    }
  }

  /*
  Memoization Solution
  1. Figure out the changing states.
  2. Here there is an index and a target that is changing.
  3. Let's assume the constraints, index <= 10^3 and target <= 10^3
  4. Then the dp array will be dp[10^3 + 1][10^3 + 1] => for dp[ind][target]
   */
  static class Solver2 {
    public boolean isSubsetSum(int[] arr, int sum) {
      int n = arr.length;
      int[][] dp = new int[n + 1][sum + 1];
      for(int[] row : dp)
        Arrays.fill( row, -1);
      return isSubsetSum(arr, sum, arr.length - 1, dp );
    }
    private boolean isSubsetSum(int[] arr, int target, int index, int[][] dp) {
      if(target == 0)
        return true;
      if(index == 0)
        return arr[index] == target;

      if(dp[index][target] != -1)
        return dp[index][target] != 0;

      boolean take = false;
      if(target >= arr[index])
        take = isSubsetSum( arr, target - arr[index], index - 1, dp );
      boolean notTake = isSubsetSum( arr, target, index - 1 , dp);

      dp[index][target] = (take || notTake) ? 1 : 0;

      return take || notTake;
    }
  }
}
