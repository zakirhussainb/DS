package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_159 {
    static class Solver {
        public int solve1(String str) {
            int start = 0, end = 0, n = str.length();
            int maxLen = 0;
            Map<Character, Integer> map = new HashMap<>();
            while(end < n) {
                map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);
                while(map.size() > 2) {
                    if(map.containsKey(str.charAt(start))) {
                        map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                    }
                    map.remove(str.charAt(start), 0);
                    start++;
                }
                maxLen = Math.max(maxLen, end - start + 1);
                end++;
            }
            return maxLen;
        }
    }
}
