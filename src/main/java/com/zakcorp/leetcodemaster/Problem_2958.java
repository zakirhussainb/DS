package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2958 {
    static class Solver {
        public int solve1(int[] arr, int k) {
            int maxLength = 0;
            Map<Integer, Integer> map = new HashMap<>();
            int start = 0;
            int n = arr.length;
            for(int end = 0; end < n; end++) {
                map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);
                while(map.get(arr[end]) > k) {
                    map.put(arr[start], map.get(arr[start]) - 1);
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
            }
            return maxLength;
        }
    }
}
