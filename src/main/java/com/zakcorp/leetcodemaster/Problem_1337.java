package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_1337 {
    static class Solver {
        public int[] kWeakestRows(int[][] mat, int k) {
            int rows = mat.length;
            int cols = mat[0].length;
            int m = 0;
            int[] result = new int[rows];
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (mat[i][j] == 1) {
                        result[m]++;
                    }
                }
                m++;
            }
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for(int i = 0; i < result.length; i++) {
                map.put(i, result[i]);
            }
            final Map<Integer, Integer> sortedByValue = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new ));
            int[] weakRows = new int[k];
            final int[] f = {0};
            sortedByValue.forEach( (key, val) -> {
                if(f[0] < k) {
                    weakRows[f[0]++] = key;
                } else {
                    return;
                }
            });
            return weakRows;
        }
    }
}
