package com.zakcorp.striver_series.dp;

import com.zakcorp.striver_series.dp.DP_14.Solver4;

import java.util.Arrays;

public class DP_15
{
  /*
  Partition equal subset sum (DP- 15)
  LC - 416
  Given an integer array nums, return true if you can partition the array into two subsets
  such that the sum of the elements in both subsets is equal or false otherwise.
   */
  /*
  1. This problem is similar to the DP_14 problem.
  2. The intuition behind the problem is that we just need to check that if we can form a subset with half of the total sum.
  3. Only when the sum is even we can divide it into two halves, otherwise we can just return false.
  4. We can send half of the total sum as the target to the DP_14.isSubsetSum solution, and we will get the result.
   */
  static class Solver4 {
    DP_14.Solver4 p4 = new DP_14.Solver4();
    public boolean canPartition(int[] arr) {
      int totSum = Arrays.stream( arr ).sum();
      if ( totSum % 2 != 0 )
        return false;
      int sum = totSum / 2;
      return p4.isSubsetSum( arr, sum );
    }
  }
}
