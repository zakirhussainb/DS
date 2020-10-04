package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 04/10/20.
 *
 * @source: LeetCode
 * @topic: Two-Pointers
 * @sub-topic: 581. Shortest Unsorted Continuous Subarray / Minimum Window Sort
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 * @pseudocode:
 */
public class Problem_581 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int low = 0, high = n - 1;
            // Find the first no. that is out of sorting order from the beginning of the array.
            while(low < n - 1 && arr[low] < arr[low + 1]) {
                low++;
            }
            // When the entire array is already sorted, return 0.
            if(low == n - 1)
                return 0;
            // Find the first no. that is out of the sorting order from the end of the array.
            while(high > 0 && arr[high] > arr[high - 1]) {
                high--;
            }
            // Find the Maximum and Minimum of the sub-array.
            // This is required to include the indices that may also contain elements that make the array unsorted.
            int subArrMin = Integer.MAX_VALUE, subArrMax = Integer.MIN_VALUE;
            for(int i = low; i <= high; i++) {
                subArrMin = Math.min(subArrMin, arr[i]);
                subArrMax = Math.max(subArrMax, arr[i]);
            }
            // extend the sub-array to include any number that is greater than the minimum no. of the sub-array
            while(low > 0 && arr[low - 1] > subArrMin ) {
                low--;
            }
            // extend the sub-array to include any number that is smaller than the maximum no. of the sub-array
            while(high < n - 1 && arr[high + 1] < subArrMax) {
                high++;
            }
            return high - low + 1;
        }
    }
}