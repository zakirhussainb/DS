package com.zakcorp.leetcodemaster;

import java.util.Arrays;

/**
 * Created by Zakir Hussain B on 27/09/20.
 *
 * @source: Grokking Coding Interview
 * @topic: Two Pointers
 * @sub-topic: Squaring a Sorted Array (easy)
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/squares-of-a-sorted-array/
 * @pseudocode:
 */
public class Problem_977 {
    static class Solver {
        public int[] solve1(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                arr[i] = arr[i] * arr[i];
            }
            Arrays.sort(arr);
            return arr;
        }
        public int[] solve2(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
            int left = 0, right = n - 1;
            int highestSquareIndex = n - 1;
            while(left <= right) {
                int leftSquare = arr[left] * arr[left];
                int rightSquare = arr[right] * arr[right];
                if(leftSquare > rightSquare) {
                    result[highestSquareIndex--] = leftSquare;
                    left++;
                } else {
                    result[highestSquareIndex--] = rightSquare;
                    right--;
                }
            }
            return result;
        }
    }
}