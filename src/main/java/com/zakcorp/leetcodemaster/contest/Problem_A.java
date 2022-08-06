package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public List<List<Integer>> solve1(int[][] items1, int[][] items2) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int[] item1 : items1) {
                int val = item1[0];
                int weight = item1[1];
                map.put(val, weight);
            }
            for(int[] item2 : items2) {
                int val = item2[0];
                int weight = item2[1];
                if(map.containsKey(val)) {
                    map.put(val, map.get(val) + weight);
                } else {
                    map.put(val, weight);
                }
            }
            List<List<Integer>> res = new ArrayList<>();
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                List<Integer> list = new ArrayList<>();
                list.add(entry.getKey());
                list.add(entry.getValue());
                res.add(list);
            }
            return res;
        }
    }
}
