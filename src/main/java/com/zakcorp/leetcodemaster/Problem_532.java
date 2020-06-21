package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_532 {
    static class Solver {
        public int findPairs(int[] arr, int k) {
            Arrays.sort(arr);
            int n = arr.length;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = n - 1; i >= 0; i--) {
                for(int j = i - 1; j >= 0; j--) {
                    if(arr[i] - arr[j] == k) {
                        map.put(arr[i], arr[j]);
                    }
                }
            }
            return map.size();
        }
    }
}
