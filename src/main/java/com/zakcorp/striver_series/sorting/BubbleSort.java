package com.zakcorp.striver_series.sorting;

import java.util.Arrays;

public class BubbleSort
{
  /*
  Keywords to remember bubble sort algorithm
  TLDR: Pushes the maximum to the last by adjacent swapping

  Best Case TC      : O(N) -> for arrays that are already sorted, the if condition helps in reducing the loops.
  Worst/Avg Case TC : O(N^2)
   */
  public int[] sort(int[] arr) {
    int n = arr.length;
    System.out.println( "Before Bubble Sort :- " + Arrays.toString(arr));
    for(int i = 0; i < n ; i++) {
      boolean isSwapped = false;
      for(int j = 0; j < n - i - 1; j++) {
        if(arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          isSwapped = true;
        }
      }
      if(!isSwapped)
        break;
      // this print statement here is for understanding the test2 -> for array that is already sorted, TC is O(N)
      System.out.println("runs...");
    }
    System.out.println( "After Bubble Sort :- " + Arrays.toString(arr));
    return arr;
  }

}
