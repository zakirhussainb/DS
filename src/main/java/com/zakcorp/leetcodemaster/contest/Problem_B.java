package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {

    static class Solver1 {
        public long[] solve1(int[] arr) {
            int n = arr.length;
            Map<Integer, List<Integer>> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                if(!map.containsKey( arr[i] )) {
                    map.put(arr[i], new ArrayList<>());
                }
                map.get( arr[i] ).add( i );
            }
            long[] out = new long[n];
            for(int i = 0; i < n; i++) {
                List<Integer> indices = map.get( arr[i] );
                if(indices.size() == 1) {
                    out[i] = 0;
                    continue;
                }
                for(int index : indices) {
                    if(i != index) {
                        out[i] += Math.abs(i - index);
                    }
                }
            }
            return out;
        }
    }
    static class Solver2 {

        public long[] solve1(int[] nums) {
            int n = nums.length;
            long[] out = new long[n];
            Map<Integer, Integer> countMap = new HashMap<>();
            Map<Integer, Long> sumMap = new HashMap<>();
            int totalCount = 0;
            long totalSum = 0;
            for(int i = 0; i < n; i++) {
                countMap.put(nums[i], countMap.getOrDefault( nums[i], 0 ) + 1);
                sumMap.put(nums[i], sumMap.getOrDefault( nums[i], 0L ) + 1);
                totalCount++;
                totalSum += i;
            }

            for(int i = 0; i < n; i++) {
                int count = countMap.getOrDefault( nums[i], 0);
                long sum = sumMap.getOrDefault( nums[i], 0L);
                if(nums[i] == nums[1] && i != 1) {
                    out[i] = (int)(count * (long) i - sum) + (int)(totalSum - sum - totalCount * (long)i);
                }
            }
            return out;
        }
    }
}
