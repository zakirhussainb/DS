package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_442 {
    static class Solver {
        public List<Integer> solve1(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Integer> list = new ArrayList<>();
            map.forEach( (key, value) -> {
                if(value == 2) {
                    list.add(key);
                }
            });
            return list;
        }
        public List<Integer> solve2(int[] nums) {
            int n = nums.length;
            int[] arr = new int[n + 1];
            for(int num : nums) {
                arr[num]++;
            }
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 2) {
                    list.add(i);
                }
            }
            return list;
        }
        public List<Integer> solve3(int[] nums) {
            int n = nums.length;
            boolean[] bArr = new boolean[n + 1];
            List<Integer> list = new ArrayList<>();
            for(int num : nums) {
                if( bArr[num] ) {
                    list.add(num);
                } else {
                    bArr[num] = true;
                }
            }
            return list;
        }
        public List<Integer> solve4(int[] arr) {
            List<Integer> result = new ArrayList<>();
            int n = arr.length;
            if(arr.length < 2) {
                return result;
            }
            for(int i = 0; i < n; i++) {
                int index = Math.abs(arr[i]);
                if(arr[index - 1] < 0) {
                    result.add(index);
                } else {
                    arr[index - 1] *= -1;
                }
            }
            return result;
        }
    }
}
