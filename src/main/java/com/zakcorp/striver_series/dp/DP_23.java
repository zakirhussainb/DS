package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_23
{
  /*
    Unbounded Knapsack Problem
    Given a set of N items, each with a weight and a value, represented by the array w[] and val[] respectively. Also, a knapsack with weight limit W.
    The task is to fill the knapsack in such a way that we can get the maximum profit. Return the maximum profit.
    Note: Each item can be taken any number of times.
    Example 1:
      Input: N = 2, W = 3
      val[] = {1, 1}
      wt[] = {2, 1}
      Output: 3
      Explanation:
      1.Pick the 2nd element thrice.
      2.Total profit = 1 + 1 + 1 = 3. Also the total
        weight = 1 + 1 + 1  = 3 which is <= W.
   */
  static class Solver1 {
    /*
    Recursive Approach to the 0-1 Knapsack problem
    1. Express in terms of (index, weight)
    2. Explore all the possibilities, i.e. when you are at an element, you can either pick or not pick
    3. Return the maximum of the two elements.
     */
    public int unboundedKnapSack(int W, int wt[], int val[], int n) {
      return recursiveKnapSack(n - 1, W, wt, val);
    }

    private int recursiveKnapSack(int index, int W, int[] wt, int[] val) {
      if(index == 0) {
        return (W / wt[index]) * val[index];
      }
      int notPick = recursiveKnapSack( index - 1, W, wt, val );
      int pick = Integer.MIN_VALUE;
      if(W >= wt[index]) {
        pick = val[index] + recursiveKnapSack( index, W - wt[index], wt, val );
      }
      return Math.max( pick, notPick );
    }
  }

  static class Solver2 {
    public int unboundedKnapSack(int W, int wt[], int val[], int n) {
      int[][] memo = new int[n][W + 1];
      for(int[] row : memo)
        Arrays.fill( row, -1 );
      return memoizedKnapSack(n - 1, W, wt, val, memo);
    }

    private int memoizedKnapSack(int index, int W, int[] wt, int[] val, int[][] memo) {
      if(index == 0) {
        return (W / wt[index]) * val[index];
      }
      if(memo[index][W] != -1) {
        return memo[index][W];
      }
      int notPick = memoizedKnapSack( index - 1, W, wt, val, memo );
      int pick = Integer.MIN_VALUE;
      if(W >= wt[index]) {
        pick = val[index] + memoizedKnapSack( index, W - wt[index], wt, val, memo );
      }
      memo[index][W] = Math.max( pick, notPick );

      return memo[index][W];
    }
  }

  static class Solver3 {
    public int unboundedKnapSack(int W, int wt[], int val[], int n) {
      int[][] dp = new int[n][W + 1];
      for(int w = 0; w <= W; w++) {
        dp[0][w] = (w / wt[0]) * val[0];
      }

      for(int index = 1; index < n; index++) {
        for(int w = 0; w <= W; w++) {
          int notPick = dp[index - 1][w];
          int pick = 0;
          if(w >= wt[index]) {
            pick = val[index] + dp[index][w - wt[index]];
          }
          dp[index][w] = Math.max( pick, notPick );
        }
      }
      return dp[n - 1][W];
    }
  }

  static class Solver4 {
    public int unboundedKnapSack(int W, int wt[], int val[], int n) {
      int[] prev = new int[W + 1];
      for(int w = 0; w <= W; w++) {
        prev[w] = (w / wt[0]) * val[0];
      }

      for(int index = 1; index < n; index++) {
        int[] curr = new int[W + 1];
        for(int w = 0; w <= W; w++) {
          int notPick = prev[w];
          int pick = 0;
          if(w >= wt[index]) {
            pick = val[index] + curr[w - wt[index]];
          }
          curr[w] = Math.max( pick, notPick );
        }
        prev = curr;
      }
      return prev[W];
    }
  }
}
