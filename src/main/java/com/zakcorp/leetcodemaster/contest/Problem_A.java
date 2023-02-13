package com.zakcorp.leetcodemaster.contest;

public class Problem_A {
    static class Solver {
//        # Given an array of positive numbers and a positive number 'k', find the maximum sum of any contiguous subarray of size 'k'.
//            # Input: [2, 1, 5, 1, 3, 2], k=3
//            # Output: 9
//            # Explanation: Subarray with maximum sum is [5, 1, 3].
        public long solve1(int[] arr, int k) {
            int start = 0;
            int maxVal = -1;
            int sum = 0;
            for(int end = 0; end < arr.length; end++) {
                sum += arr[end];
                if(end - start + 1 >= k) {
                    maxVal = Math.max(maxVal, sum);
                    sum -= arr[start];
                    start++;
                }
            }
            return maxVal;
        }
    }
}
