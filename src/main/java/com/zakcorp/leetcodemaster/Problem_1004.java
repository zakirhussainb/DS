package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 18/09/20.
 *
 * @source: Grokking Coding
 * @topic: Sliding Window
 * @sub-topic: Sliding Window, Longest Subarray with Ones after Replacement
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/max-consecutive-ones-iii/
 * @pseudocode:
 */
public class Problem_1004 {
    public int longestOnes(int[] arr, int K) {
        int n = arr.length;
        int start = 0, maxOnes = 0, maxLength = 0;
        for(int end = 0; end < n; end++) {
            if(arr[end] == 1)
                maxOnes++;
            // Why a while loop? To adjust the window size until it has the K number of zeros in it.
            while( (end - start + 1) - maxOnes > K ) {
                if(arr[start] == 1)
                    maxOnes--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}