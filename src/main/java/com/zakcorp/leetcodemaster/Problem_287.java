package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 13/10/20.
 *
 * @source: LeetCode
 * @topic: Duplicate Number
 * @sub-topic: Cyclic Sort, HashSet, Two Pointer, Binary Search
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/find-the-duplicate-number/
 * @pseudocode:
 */
public class Problem_287 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int[] hash = new int[n + 1];
            for(int num : arr) {
                hash[num]++;
            }
            for(int i = 0; i < n; i++) {
                if(hash[i] >= 2) {
                    return i;
                }
            }
            return -1;
        }
    }
}