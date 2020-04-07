package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_Day_7 {
    static class Solver {
        public int countElements(int[] arr) {
            final int[] counter = {0};
            int n = arr.length;
            if(n == 1) {
                return counter[0];
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int item : arr) {
                map.put(item, 0);
            }
            for (int item : arr) {
                if (map.containsKey(item + 1)) {
                    map.put(item, map.get(item) + 1);
                }
            }
            map.values().forEach( value -> counter[0] = counter[0] + value);
            return counter[0];
        }
    }
}
