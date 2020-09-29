package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 27/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_15 {
    static class Solver {
        public List<List<Integer>> solve1(int[] arr) {
            // TODO:- This is giving TLE, need to provide an optimised solution
            if(arr == null || arr.length == 0) {
                return new ArrayList<>();
            }
            int n = arr.length;
            Set<List<Integer>> set = new HashSet<>();
            Arrays.sort(arr);
            for(int i = 0; i < n - 2; i++) {
                for(int j = i + 1; j < n - 1; j++) {
                    List<Integer> list = new ArrayList<>();
                    for(int k = j + 1; k < n; k++) {
                        if(arr[i] + arr[j] + arr[k] == 0 && list.size() < 3) {
                            list.add(arr[i]);
                            list.add(arr[j]);
                            list.add(arr[k]);
                            set.add(list);
                        }
                    }
                }
            }
            return new ArrayList<>(set);
        }
        public List<List<Integer>> solve2(int[] arr) {
            int n = arr.length;
            if(n == 0)
                return new ArrayList<>();
            Set<List<Integer>> result = new HashSet<>();
            Arrays.sort(arr);
            for(int i = 0; i < n - 2; i++) {
                int left = i + 1;
                int right = n - 1;
                while(left < right) {
                    int tripletSum = arr[left] + arr[right] + arr[i];
                    if(tripletSum == 0) {
                        result.add(Arrays.asList(arr[left], arr[right], arr[i]));
                        left++;
                        right--;
                    } else if(tripletSum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return new ArrayList<>(result);
        }
    }
}