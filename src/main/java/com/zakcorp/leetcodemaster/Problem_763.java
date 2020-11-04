package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_763 {
    static class Solver {
        public List<Integer> solve1(String str) {
            List<Integer> result = new ArrayList<>();
            int n = str.length();
            // Since you can maintain the order lexicographically, you can use a simple hash array, as using a TreeMap
            // will be costlier
            int[] lastIndexArr = new int[26];
            for(int i = 0; i < n; i++) {
                lastIndexArr[str.charAt(i) - 'a'] = i;
            }
            // Use Two-Pointers, start, end and one extra pointer to track the maximum index
            int start = 0, maxIndex = 0;
            for(int end = 0; end < n; end++) {
                maxIndex = Math.max(maxIndex, lastIndexArr[str.charAt(end) - 'a']);
                if(end == maxIndex) {
                    result.add(end - start + 1);
                    start = end + 1;
                }
            }
            return result;
        }
    }
}
