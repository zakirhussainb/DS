package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_19
{
  /*
    0 - 1 Knapsack Problem
    You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value
    in the knapsack. Note that we have only one quantity of each item.
    In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and
    weights associated with N items respectively. Also given an integer W which represents knapsack capacity,
    find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
    You cannot break an item, either pick the complete item or dont pick it (0-1 property).
    Example 1:
      Input:
        N = 3
        W = 4
        values[] = {1,2,3}
        weight[] = {4,5,1}
      Output: 3
   */
  static class Solver1 {
    /*
    Recursive Approach to the 0-1 Knapsack problem
    1. Express in terms of (index, weight)
    2. Explore all the possibilities, i.e. when you are at an element, you can either pick or not pick
    3. Return the maximum of the two elements.
     */
    public int knapSack(int W, int wt[], int val[], int n) {
      return recursiveKnapSack(n - 1, W, wt, val);
    }

    private int recursiveKnapSack(int index, int W, int[] wt, int[] val) {
      if(index == 0) {
        if(W >= wt[index]) return val[index];
        return 0;
      }
      int notPick = recursiveKnapSack( index - 1, W, wt, val );
      int pick = Integer.MIN_VALUE;
      if(W >= wt[index]) {
        pick = val[index] + recursiveKnapSack( index - 1, W - wt[index], wt, val );
      }
      return Math.max( pick, notPick );
    }
  }

  static class Solver2 {
    /*
    Memoized Approach to the 0-1 Knapsack problem
    Create a memo array of size memo[n][W + 1] -> why W + 1 -> because we have to consider the actual weight also
     */
    public int knapSack(int W, int wt[], int val[], int n) {
      int[][] memo = new int[n][W + 1];
      for(int[] row : memo)
        Arrays.fill( row, -1);
      return memoizedKnapSack(n - 1, W, wt, val, memo);
    }

    private int memoizedKnapSack(int index, int W, int[] wt, int[] val, int[][] memo) {
      if(index == 0) {
        if(W >= wt[index]) return val[index];
        return 0;
      }
      if(memo[index][W] != -1) {
        return memo[index][W];
      }
      int notPick = memoizedKnapSack( index - 1, W, wt, val, memo );
      int pick = Integer.MIN_VALUE;
      if(W >= wt[index]) {
        pick = val[index] + memoizedKnapSack( index - 1, W - wt[index], wt, val, memo );
      }
      memo[index][W] = Math.max( pick, notPick );
      return memo[index][W];
    }
  }

  static class Solver3 {
    /*
    Tabulation Approach to the 0-1 Knapsack problem

     */
    public int knapSack(int W, int wt[], int val[], int n) {
      int[][] dp = new int[n][W + 1];
      for(int wgt = wt[0]; wgt <= W; wgt++)
        dp[0][wgt] = val[0];

      for(int index = 1; index < n; index++) {
        for(int weight = 0; weight <= W; weight++) {
          int notPick = dp[index - 1][weight];
          int pick = Integer.MIN_VALUE;
          if(weight >= wt[index]) {
            pick = val[index] + dp[index - 1][weight - wt[index]];
          }
          dp[index][weight] = Math.max( pick, notPick );
        }
      }
      return dp[n - 1][W];
    }
  }

  static class Solver4 {
    /*
    Space Optimization Approach to the 0-1 Knapsack problem
     */
    public int knapSack(int W, int wt[], int val[], int n) {
      int[] prev = new int[W + 1];
      for(int wgt = wt[0]; wgt <= W; wgt++)
        prev[wgt] = val[0];

      for(int index = 1; index < n; index++) {
        int[] curr = new int[W + 1];
        for(int weight = 0; weight <= W; weight++) {
          int notPick = prev[weight];
          int pick = Integer.MIN_VALUE;
          if(weight >= wt[index]) {
            pick = val[index] + prev[weight - wt[index]];
          }
          curr[weight] = Math.max( pick, notPick );
        }
        prev = curr;
      }
      return prev[W];
    }
  }
}
