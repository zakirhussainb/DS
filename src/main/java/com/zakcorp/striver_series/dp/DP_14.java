package com.zakcorp.striver_series.dp;

public class DP_14
{
  /*
  Subset sum equal to target (DP- 14)
  Given an array of non-negative integers, and a value sum,
  determine if there is a subset of the given set with sum equal to given sum.
  Sol:-
    1. Express the recurrence in terms of index and target
    2. Either take an index element or not take an index element
    3. Return either take or notTake
   */
  static class Solver1 {
    public boolean isSubsetSum(int[] arr, int sum) {
      return isSubsetSum(arr, sum, arr.length - 1);
    }
    private boolean isSubsetSum(int[] arr, int target, int index) {
      if(target == 0)
        return true;
      if(index == 0)
        return arr[index] == target;
      boolean take = false;
      if(target >= arr[index])
        take = isSubsetSum( arr, target - arr[index], index - 1 );
      boolean notTake = isSubsetSum( arr, target, index - 1 );

      return take || notTake;
    }
  }
}
