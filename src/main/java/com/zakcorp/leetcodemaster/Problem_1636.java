package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_1636
{
    static class Solver {
        public int[] solve1(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int num : arr) {
                map.put( num, map.getOrDefault( num, 0 ) + 1 );
            }
            int[] res = new int[arr.length];
            List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().sorted((a, b) -> a.getValue() == b.getValue() ?
                b.getKey() - a.getKey() : a.getValue() - b.getValue()).collect( Collectors.toList() );
            int k = 0, i = 0;
            while(k < list.size()) {
                int size = list.get(k).getValue();
                while ( size --> 0 ) {
                    res[i++] = list.get( k ).getKey();
                }
                k++;
            }
            return res;
        }
    }
}
