package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1283 {
    static class Solver {
        public int solve1(int[] arr, int threshold) {
            // Find the search boundaries
            int left = 1, right = 2;
            while(computeSum(arr, right) > threshold) {
                left = right;
                right <<= 1;
            }
            // Perform Binary Search on those boundaries
            while(left <= right) {
                int mid = left + (right - left) / 2;
                long num = computeSum(arr, mid);
                if(num > threshold) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
        private long computeSum(int[] arr, int x) {
            long sum = 0;
            for(int num : arr) {
                sum += num / x + (num % x == 0 ? 0 : 1);
            }
            return sum;
        }
    }
}
