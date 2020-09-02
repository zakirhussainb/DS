package com.zakcorp.grokking.coding.slidingwindow;

/**
 * Created by Zakir Hussain B on 02/09/20.
 *
 * @source: Educative.io
 * @topic: Coding Problems Patterns
 * @sub-topic: Sliding Window
 * @platform:
 * @problem_link:
 * @pseudocode:
 *  Maximum Sum Subarray of Size K
 */
public class Chapter_2 {
    /**
     * Problem Statement #
     * Given an array of positive numbers and a positive number ‘k’,
     * find the maximum sum of any contiguous subarray of size ‘k’.
     * Input: [2, 1, 5, 1, 3, 2], k=3
     * Output: 9
     * Input: [2, 3, 4, 1, 5], k=2
     * Output: 7
     */
    public static void main(String[] args) {
        Solver p = new Solver();
        int K = 3; int[] arr = new int[]{2, 1, 5, 1, 3, 2};
//        int K = 2; int[] arr = new int[]{2, 3, 4, 1, 5};
        System.out.println(p.solve1(K, arr));
        System.out.println(p.solve2(K, arr));
    }
    static class Solver {
        // Brute Force Approach -> O(N * K)
        public int solve1(int K, int[] arr) {
            int maxSum = Integer.MIN_VALUE;
            int n = arr.length;
            for(int i = 0; i <= n - K; i++) { // O(N)
                int sum = 0;
                for(int j = i; j < i + K; j++) { // O(K)
                    sum = sum + arr[j];
                }
                maxSum = Math.max(sum, maxSum);
            } // O(N * K)
            return maxSum;
        }

        // Efficient Approach Sliding Window -> O(N)
        public int solve2(int K, int[] arr) {
            int n = arr.length;
            int start = 0;
            int maxSum = Integer.MIN_VALUE;
            int sum = 0;
            for(int end = 0; end < n; end++) { // O(N)
                sum = sum + arr[end];
                if(end >= K - 1) {
                    maxSum = Math.max(maxSum, sum);
                    sum = sum - arr[start];
                    start++;
                }
            }
            return maxSum;
        }
    }
}