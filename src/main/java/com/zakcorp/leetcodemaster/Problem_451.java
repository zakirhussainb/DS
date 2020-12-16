package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_451 {
    static class Solver {
        public String solve1(String str) {
            Map<Character, Integer> map = new HashMap<>();
            for(char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>( (a, b) -> b.getValue() - a.getValue() );
            pq.addAll(map.entrySet());

            StringBuilder sb = new StringBuilder();
            while( !pq.isEmpty() ) {
                Map.Entry<Character, Integer> entry = pq.poll();
                for(int i = 0; i < entry.getValue(); i++) {
                    sb.append(entry.getKey());
                }
            }
            return sb.toString();
        }
    }
}
