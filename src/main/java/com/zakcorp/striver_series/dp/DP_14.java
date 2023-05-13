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

  /*
  Tabulation Approach
  1. Figure out the changing states.
  2. The no. of states represent the no. of nested loops
  3. Seed the base cases into the dp array
  3. Index will go from 1 to n - 1 since it is Bottom-Up
      -> Target will go from 1 to target since it is Bottom-Up
  4. Finally return dp[n - 1][sum]
   */
  static class Solver3 {
    public boolean isSubsetSum(int[] arr, int sum) {
      int n = arr.length;
      boolean[][] dp = new boolean[n + 1][sum + 1];
      for(int i = 0; i < n; i++)
        dp[i][0] = true;
      if(arr[0] <= sum)
        dp[0][arr[0]] = true;
      for(int ind = 1; ind < n; ind++) {
        for(int target = 1; target <= sum; target++) {
          boolean notTake = dp[ind - 1][target];
          boolean take = false;
          if(target >= arr[ind])
            take = dp[ind - 1][target - arr[ind]];

          dp[ind][target] = take || notTake;
        }
      }
      return dp[n - 1][sum];
    }
  }

  /*
  Space Optimization Approach
  1. Use prev and curr. Create prev array of sum + 1 length
  2. Rest of the things are same.
   */
  static class Solver4 {
    public boolean isSubsetSum(int[] arr, int sum) {
      int n = arr.length;
      boolean[] prev = new boolean[sum + 1];
      prev[0] = true;
      if(arr[0] <= sum)
        prev[arr[0]] = true;

      for(int ind = 1; ind < n; ind++) {
        boolean[] curr = new boolean[sum + 1];
        curr[0] = true;
        for(int target = 1; target <= sum; target++) {
          boolean notTake = prev[target];
          boolean take = false;
          if(target >= arr[ind])
            take = prev[target - arr[ind]];

          curr[target] = take || notTake;
        }
        prev = curr;
      }
      return prev[sum];
    }
  }
}
