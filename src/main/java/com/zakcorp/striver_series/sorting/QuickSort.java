package com.zakcorp.striver_series.sorting;

import java.util.Arrays;

public class QuickSort
{
  /*
  Keywords to remember quick sort algorithm
  TLDR: Pivot and Partition
  1. Pick up a pivot and place it in its correct place in the sorted array.
  2. Smaller on the left, larger on the right.

  Best Case TC      :
  Worst/Avg Case TC :
   */
  public int[] sort(int[] arr) {
    int n = arr.length;
    System.out.println( "Before Quick Sort :- " + Arrays.toString(arr));

    quickSort(arr, 0, n - 1);


    System.out.println( "After Quick Sort :- " + Arrays.toString(arr));
    return arr;
  }

  private void quickSort(int[] arr, int low, int high) {
    if(low < high) {
      int pIndex = partition(arr, low, high);
      quickSort(arr, low, pIndex - 1);
      quickSort(arr, pIndex + 1, high);
    }
  }

  private int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int pIndex = low;
    for(int i = low; i < high; i++) {
      if(arr[i] <= pivot) {
        swap(arr, i, pIndex);
        pIndex++;
      }
    }
    swap(arr, pIndex, high);
    return pIndex;
  }

  private void swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
}
