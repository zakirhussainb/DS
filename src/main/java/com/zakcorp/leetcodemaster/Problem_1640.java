package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1640 {
    static class Solver {
        public boolean solve3(int[] arr, int[][] pieces) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < arr.length; i++) {
                map.put(arr[i], i);
            }
            for(int[] piece : pieces) {
                if( !map.containsKey(piece[0]) ) {
                    return false;
                }
                int idx = map.get(piece[0]);

            }
            return true;
        }
    }
}
