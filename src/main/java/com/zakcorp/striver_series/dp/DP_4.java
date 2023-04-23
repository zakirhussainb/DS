package com.zakcorp.striver_series.dp;

public class DP_4
{
  /*
  Problem Statement
     There are n stones and an array of heights and Geek is standing at stone 1 and can jump to one of the following:
      Stone i+1, i+2, ... i+k stone and cost will be [hi - hj] is incurred, where j is the stone to land on.
      Find the minimum possible total cost incurred before the Geek reaches Stone N.
     Example:
      Input:
      n = 5, k = 3
      height = {10, 30, 40, 50, 20}
      Output:
      30
      Explanation:
      Geek will follow the path 1->2->5, the total cost
      would be | 10-30| + |30-20| = 30, which is minimum
   */
  static class Solver1 {
    // Recursive Solution
    // Gives TLE for larger inputs
    public int minimizeCost(int[] arr, int k) {
      return minimizeCost( arr, arr.length - 1, k );
    }

    private int minimizeCost(int[] arr, int n, int k) {
      if(n == 0)
        return 0;
      int minVal = Integer.MAX_VALUE;
      for(int i = 1; i <= k; i++) {
        if(i <= n) {
          int cost = minimizeCost( arr, n - i, k ) + Math.abs( arr[n] - arr[n - i] );
          minVal = Math.min( minVal, cost);
        }
      }
      return minVal;
    }
  }

  static class Solver2 {
    // Memoized Solution
    // Gives TLE for larger inputs -> since the TC now is { O(N) * K } (because of for loop)
    // SC O(N)(Recursion stack space) + O(N)(dp array)
    public int minimizeCost(int[] arr, int k) {
      int n = arr.length;
      return minimizeCost( arr, n - 1, k, new int[n + 1] );
    }
    private int minimizeCost(int[] arr, int n, int k, int[] memo) {
      if(n == 0)
        return 0;
      if(memo[n] != 0)
        return memo[n];
      int minVal = Integer.MAX_VALUE;
      for(int i = 1; i <= k; i++) {
        if(i <= n) {
          int cost = minimizeCost( arr, n - i, k, memo ) + Math.abs( arr[n] - arr[n - i] );
          minVal = Math.min( minVal, cost );
        }
      }
      memo[n] = minVal;
      return minVal;
    }
  }

  static class Solver3 {
    // Tabulation Solution
    // This is passing because there is no extra space optimization of the recursion stack space involved.
    // TC : O(N * K) and SC : O(N)
    public int minimizeCost(int[] arr, int k) {
      int n = arr.length;
      int[] dp = new int[n];
      dp[0] = 0;
      for(int i = 1; i < n; i++) {
        int minSteps = Integer.MAX_VALUE;
        for(int j = 1; j <= k; j++) {
          if(i - j >= 0) {
            int cost = dp[i - j] + Math.abs( arr[i] - arr[i - j] );
            minSteps = Math.min( minSteps, cost );
          }
        }
        dp[i] = minSteps;
      }
      return dp[n - 1];
    }

  }

  static class Solver4 {
    // Space Optimization
    // For space optimizing the above solution you can create a list with k elements instead of prev2 and prev in the
    // DP_3 problem. This will reduce the time complexity to O(K)
  }
}
