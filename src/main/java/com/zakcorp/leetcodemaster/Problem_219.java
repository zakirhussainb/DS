package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_219 {
    static class Solver {
        public boolean containsNearbyDuplicate(int[] arr, int k) {
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[i] == arr[j]) {
                        if(k >= j - i) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
    static class Solver1 {
        public boolean containsNearbyDuplicate(int[] arr, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                if(map.containsKey(arr[i])) {
                    if(k >= i - map.get(arr[i])) {
                        return true;
                    }
                }
                map.put(arr[i], i);
            }
            return false;
        }
    }
}
