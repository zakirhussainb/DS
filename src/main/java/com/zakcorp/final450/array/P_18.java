package com.zakcorp.final450.array;

import java.util.*;

/* Reverse the array */
public class P_18 {
    static class Solver {
        public int solve1(int[] arr, int n, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            int twiceCount = 0;
            for(int i = 0; i < n; i++) {
                int val = k - arr[i];
                if(map.containsKey(val))
                    twiceCount += map.get(val);
                if (val == arr[i]) {
                    twiceCount--;
                }
            }
            return twiceCount / 2;
        }
        public int solve2(int[] arr, int n, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            List<int[]> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                int val = k - arr[i];
                if(map.containsKey(val)) {
                    int count = map.get(val);
                    for(int j = 0; j < count; j++) {
                        list.add(new int[]{val, arr[i]});
                    }
                }
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            return list.size();
        }
    }
}
