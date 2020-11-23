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
        public int solve2(int[] arr, int threshold) {
            int left = 1, right = arr[arr.length - 1];
            while(left <= right) {
                int mid = left + (right - left) / 2;
                long sum = computeSum2(arr, mid);
                if(sum > threshold) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;
        }
        private long computeSum2(int[] arr, int x) {
            long sum = 0;
            for(int num : arr) {
                sum += (num + x - 1) / x; // sum += ( (num - 1) / x ) + 1;
            }
            return sum;
        }
    }
}

/*
It is basically how you calculate math.ceil(x).

We can also write (i + m - 1) / m as ( (i - 1) / m ) + 1 for simplification purpose.

This simple example will make it clearer I hope.
let m = 5

Case 1: i = 4
((4 - 1) / 5) + 1 = 1 (As (4 - 1) / 5 will be 0)

Case 2: i = 5
((5 - 1) / 5) + 1 = 1 (As (5 - 1) / 5 will be 0)

Case 3: i = 6
((6 - 1) / 5) + 1 = 2 (As (6 - 1) / 5 will be 1)
 */
