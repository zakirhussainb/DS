package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_5
{
  /*
  Maximum sum of non-adjacent elements
  LeetCode problem no. 198 House Robber
   */
  static class Solver {
    public int solve1(int[] arr) {
      int n = arr.length;
      int[] memo = new int[n];
      Arrays.fill( memo, -1);
      return memoized(n - 1, arr, memo);
    }
    private int memoized(int index, int[] arr, int[] memo) {
      if(index == 0) {
        return arr[index];
      }
      if(index < 0) {
        return 0;
      }
      if(memo[index] != -1) {
        return memo[index];
      }
      int pick = arr[index] + memoized( index - 2, arr, memo );
      int notPick = memoized( index - 1, arr, memo );
      memo[index] = Math.max( pick, notPick );
      return memo[index];
    }
  }

  static class Solver1 {
    public int solve1(int[] arr) {
      int n = arr.length;
      int[] dp = new int[n];
      Arrays.fill( dp, -1 );
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

  static class Solver2 {
    public int solve1(int[] arr) {
      int n = arr.length;
      int curr = 0;
      int prev = arr[0];
      int prev2 = 0;
      for(int i = 1; i < n; i++) {
        int pick = arr[i];
        if(i > 1)
          pick += prev2;
        int notPick = prev;
        curr = Math.max( pick, notPick );
        prev2 = prev;
        prev = curr;
      }
      return prev;
    }
  }

}
