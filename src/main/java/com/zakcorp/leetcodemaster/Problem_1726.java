package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1726
{
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            Map<Integer, Integer> map = new HashMap<>();
            int ans = 0;
            for(int i = 0; i < n; i++) {
                for(int j = i + 1; j < n; j++) {
                    int prod = arr[i] * arr[j];
                    ans += 8 * map.getOrDefault( prod, 0 );
                    map.put(prod, map.getOrDefault( prod, 0 ) + 1);
                }
            }
            return ans;
        }
    }
}
