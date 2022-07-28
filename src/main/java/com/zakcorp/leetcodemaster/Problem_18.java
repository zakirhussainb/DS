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
                        long sum = (long)arr[i] + (long)arr[j] + (long)arr[left] + (long)arr[right];
                        if(sum == (long)target) {
                            result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                            left++;
                            right--;
                        } else if(sum < (long)target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return new ArrayList<>(result);
        }
        public List<List<Integer>> solve2(int[] arr, int target) {
            int n = arr.length;
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(arr);
            for(int i = 0; i < n - 3; i++) {
                if(i > 0 && arr[i] == arr[i - 1]) {
                    continue;
                }
                for(int j = i + 1; j < n - 2; j++) {
                    if(j > i + 1 && arr[j] == arr[j - 1]) {
                        continue;
                    }
                    int left = j + 1, right = n - 1;
                    while(left < right) {
                        long sum = (long)arr[i] + (long)arr[j] + (long)arr[left] + (long)arr[right];
                        if(sum == (long)target) {
                            result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                            left++;
                            right--;
                            while(left < right && arr[left] == arr[left - 1]) {
                                left++;
                            }
                            while(left < right && arr[right] == arr[right + 1]) {
                                right--;
                            }
                        } else if(sum < (long)target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }
            return result;
        }
    }
    static class Solver1 {
        public List<List<Integer>> fourSum(int[] arr, int target1) {
            Arrays.sort(arr);
            return kSum(0, arr, target1, 4, arr.length);
        }
        private List<List<Integer>> kSum(int index, int[] arr, long target, int k, int n) {
            List<List<Integer>> result = new ArrayList<>();
            if(index >= n) {
                return result;
            }
            if(k == 2) {
                twoSumII(index, n - 1, target, arr, result);
            } else {
                for(int i = index; i < n - k + 1; i++) {
                    if(i > index && arr[i] == arr[i - 1])
                        continue;
                    List<List<Integer>> temp = kSum(i + 1, arr, target - arr[i], k - 1, n);
                    for(List<Integer> t : temp) {
                        t.add(0, arr[i]);
                    }
                    result.addAll(temp);
                }
            }
            return result;
        }
        private void twoSumII(int low, int high, long target, int[] arr, List<List<Integer>> result) {
            while(low < high) {
                int sum = arr[low] + arr[high];
                if(sum < target) {
                    low++;
                } else if(sum > target) {
                    high--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[low]);
                    list.add(arr[high]);
                    result.add(list);
                    while(low < high && arr[low] == arr[low + 1])
                        low++;
                    while(low < high && arr[high] == arr[high - 1])
                        high--;
                    low++;
                    high--;
                }
            }
        }
    }
}