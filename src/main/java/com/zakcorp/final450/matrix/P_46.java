package com.zakcorp.final450.matrix;

import java.util.*;

public class P_46 {
    static class Solver {
        /*
        https://www.geeksforgeeks.org/common-elements-in-all-rows-of-a-given-matrix/
        */
        public List<Integer> solve1(int[][] mat) {
            List<Integer> output = new ArrayList<>();
            int m = mat.length;
            int n = mat[0].length;
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    int num = mat[i][j];
                    if( !map.containsKey(num) ) {
                        map.put(num, new HashSet<>());
                    }
                    map.get(num).add(i);
                }
            }
            for(Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
                if(entry.getValue().size() == m ) {
                    output.add(entry.getKey());
                }
            }
            return output;
        }
    }
}
