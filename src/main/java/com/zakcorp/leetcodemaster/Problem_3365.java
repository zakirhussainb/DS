package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_3365 {
    static class Solver {
        public boolean solve1(String s, String t, int k) {
            int n = s.length();
            int m = n / k;
            Map<String, Integer> map = new HashMap<>();
            int start = 0;
            while(start < n) {
                String x = s.substring(start, start + m);
                map.put(x, map.getOrDefault(x, 0) + 1);
                start += m;
            }
            start = 0;
            while(start < n) {
                String x = t.substring(start, start + m);
                if(map.containsKey(x)) {
                    map.put(x, map.get(x) - 1);
                    map.remove(x, 0);
                    start += m;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
