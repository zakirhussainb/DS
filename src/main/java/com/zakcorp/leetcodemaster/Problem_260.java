package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_260 {
    static class Solver {
        public int[] solve1(int[] arr) {
            // Time and Space -> O(n) and O(n)
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int[] k = new int[]{0};
            map.forEach((key, value) -> {
                if(value == 1) {
                    result[k[0]++] = key;
                }
            });
            return result;
        }
        public int[] solve2(int[] arr) {
            // TODO:- Learn and implement this "Bit Manipulation" solution.
            // Time and Space -> O(n) and O(1)
            // Pass 1:
            int diff = 0;
            for(int num : arr) {
                diff = diff ^ num;
            }
            diff = diff & -diff;
            System.out.println("diff.." + diff);
            int[] res = new int[]{0, 0};
            return res;
        }
    }
}
