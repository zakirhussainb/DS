package com.zakcorp.striver_series.dp;

import java.util.HashMap;
import java.util.Map;

public class DP_22
{
  /*
    NOTE:- Dont move back to the previous index, when the question says that you can use the array elements infinite times
   */
  static class Solver1 {
    public int change(int amount, int[] coins) {
      int n = coins.length;
      return recursive(n - 1, amount, coins);
    }

    private int recursive(int index, int amount, int[] coins) {
      if(index == 0) {
        if(amount % coins[index] == 0)  {
          return 1;
        } else {
          return 0;
        }
      }
      int notTake = recursive( index - 1, amount, coins );
      int take = 0;
      if(coins[index] <= amount) {
        take = recursive( index, amount - coins[index], coins );
      }
      return take + notTake;
    }
  }
}
