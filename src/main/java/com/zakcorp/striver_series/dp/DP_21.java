package com.zakcorp.striver_series.dp;

import java.util.*;

public class DP_21
{
  /*
    Target Sum - LC 494
    You are given an integer array nums and an integer target.
    You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and
    then concatenate all the integers.
    For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the
    expression "+2-1".
    Return the number of different expressions that you can build, which evaluates to target.

    NOTE:- This problem is similar to the DP-18 - Count Partitions With Given Difference
   */
  static class Solver5 {
    /*
    But we will do it in the traditional way
     */
    public int findTargetSumWays(int[] arr, int target) {
      int n = arr.length;
      return recursiveFindTargetSumWays(arr, n - 1, target, 0);
    }
    private int recursiveFindTargetSumWays(int[] arr, int index, int target, int currSum) {
      if(index < 0 && currSum == target)
        return 1;
      if(index < 0)
        return 0;

      int plus = recursiveFindTargetSumWays( arr, index - 1, target, currSum + arr[index] );
      int minus = recursiveFindTargetSumWays( arr, index - 1, target, currSum - arr[index] );

      return plus + minus;
    }
  }

  static class Solver6 {
    /*
     Memoized solution
     We are going to HashMap here instead of a 2D array.
     */
    public int findTargetSumWays(int[] arr, int target) {
      int n = arr.length;
      Map<String, Integer> memo = new HashMap<>();
      return memoizedFindTargetSumWays(arr, n - 1, target, 0, memo);
    }
    private int memoizedFindTargetSumWays(int[] arr, int index, int target, int currSum, Map<String, Integer> memo) {
      if(index < 0 && currSum == target)
        return 1;
      if(index < 0)
        return 0;

      String key = currSum + "_" + index;
      if(memo.containsKey( key ))
        return memo.get( key );
      int plus = memoizedFindTargetSumWays( arr, index - 1, target, currSum + arr[index], memo );
      int minus = memoizedFindTargetSumWays( arr, index - 1, target, currSum - arr[index], memo );

      memo.put(key, plus + minus);

      return plus + minus;
    }
  }
}
