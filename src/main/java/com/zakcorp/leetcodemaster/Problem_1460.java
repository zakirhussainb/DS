package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1460 {
    static class Solver {
        public boolean solve1(int[] target, int[] arr) {
            // Time and Space Complexities:- O(n) and O(n)
            Map<Integer, Integer> map = new HashMap<>();
            for(int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int i = 0; int n = target.length;
            while(!map.isEmpty() && i < n) {
                if(map.containsKey(target[i])) {
                    map.put(target[i], map.get(target[i]) - 1);
                    map.remove(target[i], 0);
                }
                i++;
            }
            return map.size() == 0;
        }
    }
}
