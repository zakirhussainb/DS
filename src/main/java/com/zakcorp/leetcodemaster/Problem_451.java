package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_451 {
    static class Solver {
        static class Pair {
            char ch;
            int freq;
            public Pair(char ch, int freq) {
                this.ch = ch;
                this.freq = freq;
            }
        }
        static class MyComparator implements Comparator<Pair>{
            @Override
            public int compare(Pair o1, Pair o2) {
                return Integer.compare(o2.freq, o1.freq);
            }
        }
        public String solve1(String str) {
            Map<Character, Integer> map = new HashMap<>();
            for(char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            List<Pair> pairList = new ArrayList<>();
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                pairList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            PriorityQueue<Pair> pq = new PriorityQueue<>(new MyComparator());
            pq.addAll(pairList);
            StringBuilder res = new StringBuilder();
            while( !pq.isEmpty() ) {
                Pair p = pq.poll();
                while(p.freq --> 0) {
                    res.append(p.ch);
                }
            }
            return res.toString();
        }
    }
}
