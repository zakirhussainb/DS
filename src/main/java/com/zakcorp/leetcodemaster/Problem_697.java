package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_697 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            int[] result = {n};
            Map<Integer, Integer> count = new HashMap<>(), left = new HashMap<>(), right = new HashMap<>();
            for(int i = 0; i < n; i++) {
                if( !left.containsKey(arr[i]) ) {
                    left.put(arr[i], i);
                }
                right.put(arr[i], i);
                count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
            }
            int degree = Collections.max(count.values());
            count.forEach((key, value) -> {
                if(value == degree) {
                    result[0] = Math.min(result[0], right.get(key) - left.get(key) + 1);
                }
            });
            return result[0];
        }
        public int solve2(int[] arr) {
            int n = arr.length;
            int result = n;
            int max = 0;
            for(int num : arr) {
                max = Math.max(max, num);
            }
            int[] count = new int[max + 1];
            Integer[] left = new Integer[max + 1];
            Integer[] right = new Integer[max + 1];

            for(int i = 0; i < n; i++) {
                if(left[arr[i]] == null) {
                    left[arr[i]] = i;
                }
                right[arr[i]] = i;
                count[arr[i]]++;
            }
            int degree = 0;
            for (int num : count) {
                degree = Math.max(degree, num);
            }
            for(int i = 0; i < count.length; i++) {
                if(count[i] == degree) {
                    result = Math.min(result, right[i] - left[i] + 1);
                }
            }
            return result;
        }
    }
}
