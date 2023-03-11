package com.zakcorp.striver_series.sorting;

import java.util.Arrays;

public class InsertionSort
{
  /*
  Keywords to remember insertion sort algorithm
  TLDR: Takes an element and places it in its correct position

  Best Case TC      : O(N) -> for arrays that are already sorted, the conditional check helps stops the while loop from executing
  Worst/Avg Case TC : O(N^2)
   */
  public int[] sort(int[] arr) {
    int n = arr.length;
    System.out.println( "Before Insertion Sort :- " + Arrays.toString(arr));
    for(int i = 0; i < n; i++) {
      int j = i;
      while(j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;

        // this print statement here is for understanding the test2 -> for array that is already sorted, TC is O(N)
        System.out.println("Runs...");
      }
    }
    System.out.println( "After Insertion Sort :- " + Arrays.toString(arr));
    return arr;
  }

}
