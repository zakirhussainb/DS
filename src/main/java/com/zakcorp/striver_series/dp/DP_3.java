package com.zakcorp.striver_series.dp;

public class DP_3 {
  /*
  Problem Statement
     Geek wants to climb from the 0th stair to the (n-1)th stair.
     At a time the Geek can climb either one or two steps. A height[N] array is also given.
     Whenever the geek jumps from stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]),
     where abs() means the absolute difference. return the minimum energy that can be used by the Geek to
     jump from stair 0 to stair N-1.
     Example:
      Input:
      n = 4
      height = {10 20 30 10}
      Output:
      20
      Explanation:
      Geek jump from 1st to 2nd stair(|20-10| = 10 energy lost).
      Then a jump from the 2nd to the last stair(|10-20| = 10 energy lost).
      so, total energy lost is 20 which is the minimum.
   */
  static class Solver1 {
    // Recursive Solution
    // Gives TLE for larger inputs
    public int minimumEnergy(int[] arr) {
      return minimumEnergy( arr, arr.length - 1 );
    }
    private int minimumEnergy(int[] arr, int n) {
      if(n == 0)
        return 0;
      int left = minimumEnergy( arr, n - 1 ) + Math.abs( arr[n] - arr[n - 1] );
      int right = Integer.MAX_VALUE;
      if(n > 1)
        right = minimumEnergy( arr, n - 2 ) + Math.abs( arr[n] - arr[n - 2] );
      return Math.min(left, right);
    }
  }

  static class Solver2 {
    // Memoized Solution
    public int minimumEnergy(int[] arr) {
      int n = arr.length;
      return minimumEnergy( arr, n - 1, new int[n + 1] );
    }
    private int minimumEnergy(int[] arr, int n, int[] memo) {
      if(n == 0)
        return 0;

      if(memo[n] != 0)
          return memo[n];

      int left = minimumEnergy( arr, n - 1, memo ) + Math.abs( arr[n] - arr[n - 1] );
      int right = Integer.MAX_VALUE;
      if(n > 1)
        right = minimumEnergy( arr, n - 2, memo ) + Math.abs( arr[n] - arr[n - 2] );

      memo[n] = Math.min(left, right);

      return memo[n];
    }
  }

  static class Solver3 {
    // Tabulation Solution
    public int minimumEnergy(int[] arr) {
      int n = arr.length;
      int[] dp = new int[n];
      dp[0] = 0;
      for(int i = 1; i < n; i++) {
        int left = dp[i - 1] + Math.abs( arr[i] - arr[i - 1] );
        int right = Integer.MAX_VALUE;
        if(i > 1)
          right = dp[i - 2] + Math.abs( arr[i] - arr[i - 2] );
        dp[i] = Math.min( left, right );
      }
      return dp[n - 1];
    }
  }

  static class Solver4 {
    // Space Optimization
    public int minimumEnergy(int[] arr) {
      int n = arr.length;
      int prev2 = 0;
      int prev = 0;
      for(int i = 1; i < n; i++) {
        int left = prev + Math.abs( arr[i] - arr[i - 1] );
        int right = Integer.MAX_VALUE;
        if(i > 1)
          right = prev2 + Math.abs( arr[i] - arr[i - 2] );
        int curr = Math.min(left, right);
        prev2 = prev;
        prev = curr;
      }
      return prev;
    }
  }


}
