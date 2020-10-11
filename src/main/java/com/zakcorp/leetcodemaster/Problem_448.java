package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 11/10/20.
 *
 * @source: LeetCode
 * @topic: Cyclic Sort, Missing Number
 * @sub-topic: Find All Numbers Disappeared in an Array
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * @pseudocode:
 */
public class Problem_448 {
    static class Solver {
        public List<Integer> solve1(int[] arr) {
            int n = arr.length;
            List<Integer> result = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(num);
            }
            for(int i = 1; i <= n; i++) {
                if(!set.contains(i)) {
                    result.add(i);
                }
            }
            return result;
        }
        public List<Integer> solve2(int[] arr) {
            int n = arr.length;
            List<Integer> result = new ArrayList<>();
            int[] hash = new int[n + 1];
            for(int num : arr) {
                hash[num]++;
            }
            for(int i = 1; i <= n; i++) {
                if(hash[i] == 0) {
                    result.add(i);
                }
            }
            return result;
        }
        public List<Integer> solve3(int[] arr) {
            int n = arr.length;
            List<Integer> result = new ArrayList<>();
            for(int i = 1; i <= n; i++) {
                int pos = Math.abs(arr[i - 1]);
                arr[pos - 1] = -Math.abs(arr[pos - 1]);
            }
            for(int i = 1; i <= n; i++) {
                if(arr[i - 1] > 0) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}