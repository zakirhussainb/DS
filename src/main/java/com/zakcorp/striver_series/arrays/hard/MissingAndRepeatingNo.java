package com.zakcorp.striver_series.arrays.hard;

import java.util.ArrayList;

public class MissingAndRepeatingNo {
  /**
   * Created by Zakir Hussain B on 09/04/2023.
   *
   * @source: Striver SDE Sheet, CodeStudio
   * @problem_link: https://www.codingninjas.com/codestudio/problems/873366?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website
   * @pseudocode:
   */
  static class Solver {
    public int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
      int arrSum = getArraySum(arr, n);
      arr.add( 0 );
      int repeatingNo = getRepeatingNumber(arr, n);
      int totalSum = (n * (n + 1)) / 2;
      int missingNo = totalSum - (arrSum - repeatingNo);
      return new int[]{missingNo, repeatingNo};
    }

    private int getArraySum(ArrayList<Integer> arr, int n) {
      int sum = 0;
      for(int i = 0; i < arr.size(); i++) {
        sum += arr.get(i);
      }
      return sum;
    }
    private int getRepeatingNumber( ArrayList<Integer> arr, int n) {
      int slow = arr.get(0);
      int fast = arr.get(0);

      do {
        slow = arr.get(slow);
        fast = arr.get(arr.get(fast));
      }while(slow != fast);

      fast = arr.get(0);
      while(slow != fast) {
        slow = arr.get(slow);
        fast = arr.get(fast);
      }
      return slow;
    }
  }
}
