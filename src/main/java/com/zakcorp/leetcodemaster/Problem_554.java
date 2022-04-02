package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_554 {
    static class Solver {
        public int solve1(List<List<Integer>> wall) {
            Map<Integer, Integer> map = new HashMap<>();
            for(List<Integer> row : wall) {
                int sum = 0;
                for (int i = 0; i < row.size() - 1; i++) {
                    sum += row.get(i);
                    if(!map.containsKey(sum)) {
                        map.put(sum, 1);
                    } else {
                        map.put(sum, map.get(sum) + 1);
                    }
                }
            }
            int res = wall.size();
            for(int key : map.keySet())
                res = Math.min(res, wall.size() - map.get(key));
            return res;
        }
    }
}
