package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_1282 {
    static class Solver {
        public List<List<Integer>> solve1(int[] groupSizes) {
            List<List<Integer>> res = new ArrayList<>();
            Map<Integer, List<Integer>> map = new HashMap<>();
            for(int i = 0; i < groupSizes.length; i++) {
                int gS = groupSizes[i];
                if(!map.containsKey(gS)) {
                    map.put(gS, new ArrayList<>());
                }
                map.get(gS).add(i);
                if(map.get(gS).size() >= gS) {
                    res.add(map.get(gS));
                    map.remove(gS);
                }
            }
            return res;
        }
    }
}
