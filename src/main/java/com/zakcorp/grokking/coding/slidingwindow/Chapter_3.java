package com.zakcorp.grokking.coding.slidingwindow;

/**
 * Created by Zakir Hussain B on 03/09/20.
 *
 * @source: Grokking Coding
 * @topic: Sliding Window
 * @sub-topic: Smallest Subarray with a given sum (easy)
 * @platform: Grokking Coding Interview
 * @problem_link: Local, https://leetcode.com/problems/minimum-size-subarray-sum/
 * @pseudocode:
 */
public class Chapter_3 {
    public static void main(String[] args) {
        Chapter_3.Solver p = new Chapter_3.Solver();
        int S = 7; int[] arr = new int[]{2, 1, 5, 2, 3, 2};
//        int K = 2; int[] arr = new int[]{2, 3, 4, 1, 5};
        System.out.println(p.solve1(S, arr));
    }
    static class Solver {
        // Brute Force Approach -> O(N * K)
        public int solve1(int S, int[] arr) {
            // Brute Force
            int n = arr.length;
            int minLength = Integer.MAX_VALUE;
            int windowSum = 0;
            int start = 0;
            for(int end = 0; end < n; end++) {
                windowSum = windowSum + arr[end];
                while(windowSum >= S) {
                    minLength = Math.min(minLength, end - start + 1);
                    windowSum = windowSum - arr[start];
                    start++;
                }
            }
            return minLength;
        }
    }
}