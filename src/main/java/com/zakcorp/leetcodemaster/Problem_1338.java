package com.zakcorp.leetcodemaster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Problem_1338 {
    static class Solver {
        public int solve1(int[] arr) {
            int n = arr.length;
            Map<Integer, Integer> map = new HashMap<>();
            for(int num : arr)
                map.put(num, map.getOrDefault(num, 0) + 1);
            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
            pq.addAll(map.entrySet());
            int eop = n / 2;
            int ans = 0;
            while(!pq.isEmpty()) {
                Map.Entry<Integer, Integer> entry = pq.poll();
                eop -= entry.getValue();
                ans++;
                if(eop <= 0)
                    break;
            }
            return ans;
        }
    }
}
