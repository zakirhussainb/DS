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
        public int solve2(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n;) {
                int j = arr[i] - 1;
                if(arr[i] != arr[j]) {
                    swap(arr, i, j);
                } else {
                    i++;
                }
            }
            for(int i = 0; i < n; i++) {
                if(arr[i] != i + 1) {
                    return arr[i];
                }
            }
            return -1;
        }
        private void swap(int[] arr, int x, int y) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}