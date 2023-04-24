package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_5
{
  /*
  Maximum sum of non-adjacent elements
  LeetCode problem no. 198 House Robber
   */
  static class Solver1 {
    // Recursive Solution
    public int findMaxSum(int[] arr) {
      return findMaxSum(arr, arr.length - 1);
    }
    private int findMaxSum(int[] arr, int ind) {
      if(ind == 0)
          return arr[0];
      if(ind < 0)
          return 0;
      int pick = arr[ind] + findMaxSum( arr, ind - 2 );
      int notPick = findMaxSum( arr, ind - 1 );
      return Math.max(pick, notPick);
    }
  }

  static class Solver2 {
    // Memoization Approach
    public int findMaxSum(int[] arr) {
      int n = arr.length;
      return findMaxSum(arr, n - 1, new int[n]);
    }
    private int findMaxSum(int[] arr, int ind, int[] memo) {
      if(ind == 0)
        return arr[0];
      if(ind < 0)
        return 0;
      if(memo[ind] != 0)
          return memo[ind];
      int pick = arr[ind] + findMaxSum( arr, ind - 2, memo );
      int notPick = findMaxSum( arr, ind - 1, memo );
      memo[ind] = Math.max(pick, notPick);
      return memo[ind];
    }
  }

  static class Solver3 {
    // Tabulation Approach
    public int findMaxSum(int[] arr) {
      int n = arr.length;
      int[] dp = new int[n];
      dp[0] = arr[0];
      for(int i = 1; i < n; i++) {
        int pick = arr[i];
        if(i > 1)
          pick += dp[i - 2];
        int notPick = dp[i - 1];
        dp[i] = Math.max( pick, notPick );
      }
      return dp[n - 1];
    }
  }

}
