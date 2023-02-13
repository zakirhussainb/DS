package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    public long maxCount(int[] arr, int lower, int upper) {
        Arrays.sort(arr);
        int n = arr.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            int left = i + 1, right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[i] + arr[mid] < lower) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            int low = left;

            left = i + 1;
            right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[i] + arr[mid] > upper) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            int high = right;

            count += high - low + 1;
        }
        return count;
    }
}
