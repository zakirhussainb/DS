package com.zakcorp.final450.array;

import java.util.*;

/* Reverse the array */
public class P_25 {
    static class Solver {
        public List<Integer> solve1(int[] arr, int k) {
            int n = arr.length;
            int m = n / k;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            List<Integer> list = new ArrayList<>();
            map.forEach( (x, y) -> {
                if(y > m) {
                    list.add(x);
                }
            } );
            return list;
        }
    }
}
