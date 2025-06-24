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

        // Elegant Approach
        public int solve2(String word) {
            int ans = 0;

            int[] freq = new int[26];
            for (int i = 0; i < word.length(); i++) {
                freq[word.charAt(i) - 'a']++;
            }

            Arrays.sort(freq);
            int count = 0;
            for(int i = freq.length - 1; i >= 0; i--) {
                int cost = 0;
                if(count < 8) {
                    cost = 1;
                } else if(count < 16) {
                    cost = 2;
                } else if(count < 24) {
                    cost = 3;
                } else {
                    cost = 4;
                }

                int value = freq[i] * cost;
                ans += value;
                count++;
            }

            return ans;
        }
    }
}
