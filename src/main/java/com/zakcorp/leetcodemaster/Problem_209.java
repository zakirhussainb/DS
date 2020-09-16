package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 10/09/20.
 *
 * @source: Grokking Coding, LeetCode
 * @topic: Sliding Window
 * @sub-topic: Smallest Subarray with given sum
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/minimum-size-subarray-sum/
 * @pseudocode:
 */
public class Problem_209 {
    public int minSubArrayLen(int S, int[] arr) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0, windowSum = 0, end;
        for(end = 0; end < n; end++) {
            windowSum = windowSum + arr[end];
            while(windowSum >= S) {
                minLength = Math.min(minLength, end - start + 1);
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}