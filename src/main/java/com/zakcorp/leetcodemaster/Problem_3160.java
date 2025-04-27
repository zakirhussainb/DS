package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_3160 {
    static class Solver {
        public int[] solve1(int limit, int[][] queries) {
            Map<Integer, Integer> bcMap = new HashMap<>();
            Map<Integer, Integer> cbMap = new HashMap<>();
            int m = queries.length;
            int[] res = new int[m];
            for(int i = 0; i < m; i++) {
                int ball = queries[i][0];
                int color = queries[i][1];

                if (!bcMap.containsKey(ball)) {
                    bcMap.put(ball, color);
                } else {
                    int removeKey = bcMap.get(ball);
                    cbMap.remove(removeKey);
                    bcMap.put(queries[i][0], queries[i][1]);
                }

                cbMap.put(queries[i][1], queries[i][0]);

                res[i] = cbMap.size();
            }
            System.out.println(Arrays.toString(res));
            return res;
        }
    }
}
