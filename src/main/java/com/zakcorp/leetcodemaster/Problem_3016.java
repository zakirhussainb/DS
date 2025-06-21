package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_3016
{
    static class Solver {
        public int solve1(String word) {
            int ans = 0;

            Map<Character, Integer> map = new HashMap<>();
            for (char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>( Collections.reverseOrder() );
            pq.addAll(map.values());

            for(int c = 0; c < 4; c++) {
                if(pq.isEmpty()) break;
                for(int r = 0; r < 8; r++) {
                    if(r > 1 && c == 3) {
                        // Operation not allowed
                        continue;
                    }
                    if(!pq.isEmpty()) {
                        int val = pq.poll();
                        val = val * (c + 1);
                        ans += val;
                    } else {
                        break;
                    }
                }
            }

            return ans;
        }
    }
}
