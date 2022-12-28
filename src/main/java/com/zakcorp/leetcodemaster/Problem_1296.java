package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1296
{
    static class Solver1 {
        public boolean solve1(int[] arr, int k) {
            Map<Integer, Integer> map = new TreeMap<>();
            for(int num : arr)
                map.put(num, map.getOrDefault( num, 0 ) + 1);

            for(int x : map.keySet()) {
                if(map.get( x ) > 0) {
                    for(int i = k - 1; i >= 0; i--) {
                        if(map.getOrDefault(x + i, 0 ) < map.get( x ) )
                            return false;
                        map.put(x + i, map.get(x + i) - map.get( x ));
                    }
                }
            }
            return true;
        }
    }
}
