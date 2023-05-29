package com.zakcorp.striver_series.dp;

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
}
