package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_747 {
    static class Solver {
        public int dominantIndex(int[] nums) {
            int n = nums.length;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(nums[i] > 2 * nums[j]) {
                        max = Math.max(max, nums[i]);
                    }
                }
            }
            return max < 0 ? -1 : Arrays.binarySearch(nums, max);
        }
    }
    static class Solver1 {
        public int dominantIndex(int[] nums) {
            int n = nums.length;
            int max = Integer.MIN_VALUE;
            Map<Integer, Integer> map = new TreeMap<>();
            for(int i = 0; i < n; i++) {
                map.put(i, map.getOrDefault(nums[i], 0) + 1);
            }
            return 0;
        }
    }

}
