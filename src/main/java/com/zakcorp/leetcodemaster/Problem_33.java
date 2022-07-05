package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_33 {
    static class Solver {
        public int solve1(int[] arr, int target) {
            int n = arr.length;
            if(n == 1) {
                if(arr[0] == target)
                    return 0;
                else
                    return -1;
            }
            int rotIndex = 0;
            int minValue = arr[0];
            for(int i = 1; i < n; i++) {
                if(arr[i] < minValue) {
                    minValue = arr[i];
                    rotIndex = i;
                    break;
                }
            }
            if(arr[rotIndex] == target)
                return rotIndex;
            if(rotIndex == 0)
                return binarySearch(arr, 0, n - 1, target);
            if(arr[0] > target) {
                return binarySearch(arr, rotIndex, n - 1, target);
            } else {
                return binarySearch(arr, 0, rotIndex, target);
            }
        }
        private int binarySearch(int[] arr, int low, int high, int target) {
            while(low <= high) {
                int mid = (low + (high - low) / 2);
                if(arr[mid] > target) {
                    high = mid - 1;
                } else if(arr[mid] < target) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
}
