package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_20
{
  /*
    Minimum Coins / Coin Change - LC - 322
    You are given an integer array coins representing coins of different denominations and an integer amount
    representing a total amount of money.
    Return the fewest number of coins that you need to make up that amount. If that amount of money
    cannot be made up by any combination of the coins, return -1.
    You may assume that you have an infinite number of each kind of coin.
    Example 1:
      Input: coins = [1,2,5], amount = 11
      Output: 3
      Explanation: 11 = 5 + 5 + 1
   */
  static class Solver1 {
    /*
    Recursive Approach to Coin change problem
    1. Express in terms of (index, amount)
    2. Explore all the possibilities, i.e. when you are at an index, you can either pick or not pick
    3. And when you are picking you still have to be in the same index, because it is given in the question
    that you can pick up a coin of one denomination infinite no. of times.
    3. Return the minimum of the two elements.
     */
    public int coinChange(int[] coins, int amount) {
      int res = recursive(coins.length - 1, coins, amount);
      return res == (int)Math.pow(10,9) ? -1 : res;
    }

    private int recursive(int index, int[] coins, int amount) {
      if(index == 0) {
        if(amount % coins[index] == 0) {
          return amount / coins[index];
        } else {
          return (int)Math.pow(10,9);
        }
      }

      int notTake = recursive(index - 1, coins, amount);
      int take = (int)Math.pow(10,9);
      if(amount >= coins[index]) {
        take = 1 + recursive(index, coins, amount - coins[index]);
      }
      return Math.min(take, notTake);
    }
  }

  static class Solver2 {
    /*
    Memoized Approach to Coin Change Problem
    Create a memo array of size memo[n][amount + 1] -> why amount + 1 -> because we have to consider the actual amount also
     */
    public int coinChange(int[] coins, int amount) {
      int n = coins.length;
      int[][] memo = new int[n][amount + 1];
      for(int[] row : memo)
        Arrays.fill(row, -1);
      int res = memoized(n - 1, coins, amount, memo);
      return res == (int)Math.pow(10,9) ? -1 : res;
    }

    private int memoized(int index, int[] coins, int amount, int[][] memo) {
      if(index == 0) {
        if(amount % coins[index] == 0) {
          return amount / coins[index];
        } else {
          return (int)Math.pow(10,9);
        }
      }
      if(memo[index][amount] != -1) {
        return memo[index][amount];
      }
      int notTake = memoized(index - 1, coins, amount, memo);
      int take = (int)Math.pow(10,9);
      if(amount >= coins[index]) {
        take = 1 + memoized(index, coins, amount - coins[index], memo);
      }

      memo[index][amount] = Math.min(take, notTake);

      return memo[index][amount];
    }
  }

  static class Solver3 {
    /*
    Tabulation Approach to the Coin Change problem
     */
    public int coinChange(int[] coins, int amount) {
      int n = coins.length;
      int[][] dp = new int[n][amount + 1];
      for(int[] row : dp)
        Arrays.fill( row, -1 );
      for(int amnt = 0; amnt <= amount; amnt++) {
        if(amnt % coins[0] == 0) {
          dp[0][amnt] = amnt / coins[0];
        } else {
          dp[0][amnt] = (int)Math.pow(10,9);
        }
      }
      for(int index = 1; index < n; index++) {
        for(int amnt = 0; amnt <= amount; amnt++) {
          int notTake = dp[index - 1][amnt];
          int take = (int)Math.pow(10,9);
          if(amnt >= coins[index]) {
            take = 1 + dp[index][amnt - coins[index]];
          }
          dp[index][amnt] = Math.min(take, notTake);
        }
      }
      return dp[n - 1][amount] == (int)Math.pow(10,9) ? -1 : dp[n - 1][amount];
    }
  }

  static class Solver4 {
    /*
    Space Optimization Approach to the Coin Change problem
     */
    public int coinChange(int[] coins, int amount) {
      int n = coins.length;
      int[] prev = new int[amount + 1];

      for(int amnt = 0; amnt <= amount; amnt++) {
        if(amnt % coins[0] == 0) {
          prev[amnt] = amnt / coins[0];
        } else {
          prev[amnt] = (int)Math.pow(10,9);
        }
      }
      for(int index = 1; index < n; index++) {
        int[] curr = new int[amount + 1];
        for(int amnt = 0; amnt <= amount; amnt++) {
          int notTake = prev[amnt];
          int take = (int)Math.pow(10,9);
          if(amnt >= coins[index]) {
            take = 1 + curr[amnt - coins[index]];
          }
          curr[amnt] = Math.min(take, notTake);
        }
        prev = curr;
      }
      return prev[amount] == (int)Math.pow(10,9) ? -1 : prev[amount];
    }
  }
}
