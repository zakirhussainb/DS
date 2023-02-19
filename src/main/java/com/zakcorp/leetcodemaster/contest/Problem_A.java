package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public int[][] solve1(int[][] arr1, int[][] arr2) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i = 0; i < arr1.length; i++) {
                map.put(arr1[i][0], arr1[i][1]);
            }
            for(int i = 0; i < arr2.length; i++) {
                if(map.containsKey( arr2[i][0] )) {
                    map.put(arr2[i][0], map.get( arr2[i][0] ) + arr2[i][1]);
                } else {
                    map.put(arr2[i][0], arr2[i][1]);
                }
            }
            int[][] res = new int[map.size()][2];
            int i = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                res[i][0] = entry.getKey();
                res[i][1] = entry.getValue();
                i++;
            }
            return res;
        }
    }
}
