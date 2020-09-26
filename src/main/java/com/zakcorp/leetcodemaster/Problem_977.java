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
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = arr[i] * arr[i];
        }
        Arrays.sort(result);
        return result;
    }
}