package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_C {
    static class Solver {
        public int solve1(int[] arr1, int[] arr2) {
            int m = arr1.length;
            int maxVal = Integer.MIN_VALUE;
            for(int i = 0; i < m; i++) {
                swap(i, i, arr1, arr2);
                int val = Math.max( sum(arr1), sum(arr2) );
                maxVal = Math.max( val, maxVal );
                for(int j = 0; j < m; j++) {
                    swap(i, j, arr1, arr2);
                    int val1 = Math.max( sum(arr1), sum(arr2) );
                    maxVal = Math.max( val1, maxVal );
                }
            }
            return maxVal;
        }
        private void swap(int left, int right, int[] arr1, int[] arr2) {
            int temp = arr1[left];
            arr1[left] = arr2[right];
            arr2[right] = temp;
        }
        private int sum(int[] arr) {
            int v = 0;
            for(int i = 0; i < arr.length; i++) {
                v += arr[i];
            }
            return v;
        }
    }
}
