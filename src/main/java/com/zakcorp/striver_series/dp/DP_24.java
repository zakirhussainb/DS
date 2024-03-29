package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_24
{
  /*
    Rod Cutting

    Given a rod of length N inches and an array of prices, price[]. price[i] denotes the value of a piece of length i.
    Determine the maximum value obtainable by cutting up the rod and selling the pieces.
    Note: Consider 1-based indexing.
   */
  static class Solver1 {
    /*
      Recursive Solution.
      1. Express everything in terms of index
     */
    public int cutRod(int[] price) {
      int n = price.length;
      return recursive(n - 1, price, n);
    }
    private int recursive(int index, int[] price, int N) {
      if(index == 0) {
        return N * price[index];
      }

      int notTake = recursive( index - 1, price, N );
      int take = Integer.MIN_VALUE;
      int rodLength = index + 1;
      if(rodLength <= N) {
        take = price[index] + recursive( index, price, N - rodLength );
      }
      return Math.max( notTake, take );
    }
  }

  static class Solver2 {
    /*
     */
    public int cutRod(int[] price) {
      int n = price.length;
      int[][] memo = new int[n][n + 1];
      for(int[] row : memo)
        Arrays.fill( row, -1);
      return memoized(n - 1, price, n, memo);
    }
    private int memoized(int index, int[] price, int N, int[][] memo) {
      if(index == 0) {
        return N * price[index];
      }

      if(memo[index][N] != -1)
        return memo[index][N];

      int notTake = memoized( index - 1, price, N, memo );
      int take = Integer.MIN_VALUE;
      int rodLength = index + 1;
      if(rodLength <= N) {
        take = price[index] + memoized( index, price, N - rodLength, memo );
      }
      memo[index][N] = Math.max( notTake, take );

      return memo[index][N];
    }
  }

  static class Solver3 {
    /*
     */
    public int cutRod(int[] price)
    {
      int N = price.length;
      int[][] dp = new int[ N ][ N + 1 ];

      for(int rl = 0; rl <= N; rl++) {
        dp[0][rl] = rl * price[0];
      }

      for(int index = 1; index < N; index++) {
        for(int rl = 0; rl <= N; rl++) {
          int notTake = dp[index - 1][rl];
          int take = Integer.MIN_VALUE;
          int rodLength = index + 1;
          if(rodLength <= rl) {
            take = price[index] + dp[index][rl - rodLength];
          }
          dp[index][rl] = Math.max( notTake, take );
        }
      }
      return dp[N - 1][N];
    }
  }

  static class Solver4 {
    /*
     */
    public int cutRod(int[] price)
    {
      int N = price.length;
      int[] prev = new int[N + 1];

      for(int rl = 0; rl <= N; rl++) {
        prev[rl] = rl * price[0];
      }
      for(int index = 1; index < N; index++) {
        int[] curr = new int[N + 1];
        for(int rl = 0; rl <= N; rl++) {
          int notTake = prev[rl];
          int take = Integer.MIN_VALUE;
          int rodLength = index + 1;
          if(rodLength <= rl) {
            take = price[index] + curr[rl - rodLength];
          }
          curr[rl] = Math.max( notTake, take );
        }
        prev = curr;
      }
      return prev[N];
    }
  }

  static class Solver5 {
    /*
     */
    public int cutRod(int[] price)
    {
      int N = price.length;
      int[] prev = new int[N + 1];

      for(int rl = 0; rl <= N; rl++) {
        prev[rl] = rl * price[0];
      }
      for(int index = 1; index < N; index++) {
        for(int rl = 0; rl <= N; rl++) {
          int notTake = prev[rl];
          int take = Integer.MIN_VALUE;
          int rodLength = index + 1;
          if(rodLength <= rl) {
            take = price[index] + prev[rl - rodLength];
          }
          prev[rl] = Math.max( notTake, take );
        }
      }
      return prev[N];
    }
  }
}
