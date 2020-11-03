package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1640 {
    static class Solver {
        public boolean solve1(int[] arr, int[][] pieces) {
            Map<Integer, int[]> map = new HashMap<>();
            for(int[] p : pieces) {
                map.put(p[0], p);
            }
            int n = arr.length;
            for(int i = 0; i < n;) {
                if(!map.containsKey(arr[i])) {
                    return false;
                }
                // check target piece
                int[] targetPiece = map.get(arr[i]);
                for(int x : targetPiece) {
                    if(i >= n || x != arr[i]) {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        }
    }
}
