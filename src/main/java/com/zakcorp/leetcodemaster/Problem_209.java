package com.zakcorp.leetcodemaster;

import java.util.*;

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
    static class Solver {
        public int solve1(int S, int[] arr) {
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
        public int solve2(int s, int[] arr) {
            int n = arr.length, sum = 0;
            Arrays.sort(arr);
            for(int i = n - 1; i >= 0; i--) {
                sum += arr[i];
                if(sum >= s) {
                    return n - i;
                }
            }
            return 0;
        }
    }
}