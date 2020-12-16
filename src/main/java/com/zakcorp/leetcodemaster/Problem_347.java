package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_347 {
    public int[] topKFrequent(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        // SORT MAP BY VALUES -> Higher value to Lower value
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>( (a,b) -> b.getValue() - a.getValue() );
        pq.addAll(map.entrySet());

        int[] res = new int[k];
        int i = 0;
        while( !pq.isEmpty() && k > 0) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            res[i++] = entry.getKey();
            k--;
        }
        return res;
    }
}
