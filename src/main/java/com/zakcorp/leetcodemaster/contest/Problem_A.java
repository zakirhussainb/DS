package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_A {
    static class Solver {
        public char solve1(String str) {
            int n = str.length();
            Map<Character, int[]> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                if(!map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), new int[]{i, 101});
                } else {
                    int start = map.get(str.charAt(i))[0];
                    int end = Math.min(map.get(str.charAt(i))[1], i);
                    map.put(str.charAt(i), new int[]{start, end});
                }
            }
            int minOcc = 101;
            for(Map.Entry<Character, int[]> entry : map.entrySet()) {
                if(entry.getValue()[1] < minOcc) {
                    minOcc = entry.getValue()[1];
                }
            }
            return str.charAt(minOcc);
        }
    }
}
