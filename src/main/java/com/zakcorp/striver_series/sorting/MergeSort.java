package com.zakcorp.striver_series.sorting;

import java.util.Arrays;

public class MergeSort
{
  /*
  Keywords to remember merge sort algorithm
  TLDR: Divide and Merge

  Best Case TC      :
  Worst/Avg Case TC :
   */
  public int[] sort(int[] arr) {
    int n = arr.length;
    System.out.println( "Before Merge Sort :- " + Arrays.toString(arr));

    mergeSort(arr, 0, n - 1);

    System.out.println( "After Merge Sort :- " + Arrays.toString(arr));
    return arr;
  }

  private void mergeSort(int[] arr, int low, int high) {
    if(low >= high)
      return;
    int mid = low + (high - low) / 2; // finding middle index
    mergeSort( arr, low, mid ); // left half
    mergeSort( arr, mid + 1, high ); // right half
    merge(arr, low, mid, high); // merging sorted halves
  }

  private void merge(int[] arr, int low, int mid, int high) {
     int[] temp = new int[arr.length];
     int left = low; // starting index of the left half of arr
     int right = mid + 1; // starting index of the right half of arr
     int k = 0;
     // storing elements in the temporary array in a sorted manner
     while(left <= mid && right <= high) {
       if(arr[left] <= arr[right]) {
         temp[k] = arr[left];
         left++;
       } else {
         temp[k] = arr[right];
         right++;
       }
       k++;
     }

    //  if any elements on the left-half are still remaining
     while(left <= mid) {
       temp[k++] = arr[left];
       left++;
     }

    //  if any elements on the right-half are still remaining
     while(right <= high) {
      temp[k++] = arr[right];
      right++;
     }

    // transferring all elements from temporary to arr
     for(int i = low; i <= high; i++) {
      arr[i] = temp[i - low];
     }
  }
}
