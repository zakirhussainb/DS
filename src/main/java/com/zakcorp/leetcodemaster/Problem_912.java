package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_912 {
    static class Solver {
        public int[] solve1(int[] arr) {
            mergeSort(arr, 0, arr.length - 1);
            return arr;
        }
        private void mergeSort(int[] arr, int low, int high) {
            if(low >= high) {
                return;
            }
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        private void merge(int[] arr, int low, int mid, int high) {
            int n1 = mid - low + 1;
            int n2 = high - mid;
            int[] L = new int[n1];
            int[] R = new int[n2];
            for(int i = 0; i < n1; i++)
                L[i] = arr[low + i];
            for(int j = 0; j < n2; j++)
                R[j] = arr[mid + 1 + j];

            int i = 0, j = 0, k = low;
            while(i < n1 && j < n2) {
                if(L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            while(i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while(j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }
}
