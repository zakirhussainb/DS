package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 01/10/20.
 *
 * @source: LeetCode
 * @topic: Two-Pointers
 * @sub-topic: Find all unique quadruplets in the array which gives the sum of target.
 * @platform: LeetCode
 * @problem_link: 4Sum - https://leetcode.com/problems/4sum/
 * @pseudocode:
 */
public class Problem_18 {
    static class Solver {
        public List<List<Integer>> solve1(int[] arr, int target) {
            int n = arr.length;
            Set<List<Integer>> result = new HashSet<>();
            Arrays.sort(arr);
            for(int i = 0; i < n - 3; i++) {
                for(int j = i + 1; j < n - 2; j++) {
                    int left = j + 1, right = n - 1;
                    while(left < right) {
                        int sum = arr[i] + arr[j] + arr[left] + arr[right];
                        if(sum == target) {
                            result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                            left++;
                            right--;
                        } else if(sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return new ArrayList<>(result);
        }
    }
}