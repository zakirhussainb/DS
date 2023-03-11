package com.zakcorp.striver_series.sorting;

import java.util.Arrays;

public class SelectionSort {
  /*
  Keywords to remember selection sort algorithm
  TLDR: Select minimums and swap
    -> Select minimums
    -> First step :- Select the minimum element in the array and place it at the first -> swap the first element in its place
   */
  public int[] sort(int[] arr) {
    int n = arr.length;
    System.out.println( "Before Selection Sort :- " + Arrays.toString(arr));
    for(int i = 0; i < n - 1; i++) {
      int minIndex = i;
      int minVal = arr[i];
      for(int j = i; j < n; j++) {
        if(arr[j] < minVal) {
          minIndex = j;
          minVal = arr[j];
        }
      }
      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
    System.out.println( "After Selection Sort :- " + Arrays.toString(arr));
    return arr;
  }

}
