package com.zakcorp.striver_series.dp;

import java.util.Arrays;

public class DP_18
{
  /*
    Partitions with Given Difference - DP 18
    Given an array arr, partition it into two subsets(possibly empty) such that their union is the original array.
    Let the sum of the element of these two subsets be S1 and S2.
    Given a difference d, count the number of partitions in which S1 is greater than or equal to S2 and the
    difference S1 and S2 is equal to d. since the answer may be large return it modulo 10^9 + 7.
   */
  static class Solver3 {
    /*

     */
    public int countPartitions(int[] arr, int d){
      int totalSum = Arrays.stream(arr).sum();
      int target = ( totalSum - d ) / 2;
      if(target % 2 != 0)
        return 0;
      DP_17.Solver3 s3 = new DP_17.Solver3();
      return s3.perfectSum( arr, target );
    }
  }
}
