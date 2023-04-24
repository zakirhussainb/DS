package com.zakcorp.striver_series.dp;

public class DP_6
{
  /*
  Stickler Thief
  LeetCode problem no. 213 House Robber II
  Similar to the House Robber problem
   */
  static class Solver1 {
    // Space Optimization approach
    // Similar to the DP_5 problem, the only change is that:
    // When the first and last indexes are adjacent(since the houses are arranged in a circle).
    // You can process from [0.....n - 2] and then [1.....n - 1] -> return the maximum of both the values.
    public int findMaxSum(int[] arr) {
      int n = arr.length;
      if(n == 1)
        return arr[0];
      int ans1 = findMaxSum( arr, 0,  n - 2);
      int ans2 = findMaxSum( arr, 1, n - 1 );
      return Math.max( ans1, ans2 );
    }

    public int findMaxSum(int[] arr, int low, int high) {
      int prev2 = 0;
      int prev = arr[low];
      for(int i = low + 1; i <= high; i++) {
        int pick = arr[i];
        if(i > 1)
          pick += prev2;
        int notPick = prev;
        int curr = Math.max( pick, notPick );
        prev2 = prev;
        prev = curr;
      }
      return prev;
    }
  }

}
