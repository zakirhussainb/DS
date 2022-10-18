package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1451 {
    static class Solver {
        static class Pair {
            int pos;
            int len;
            String str;
            public Pair(int pos, int len, String str) {
                this.pos = pos;
                this.len = len;
                this.str = str;
            }
        }
        public String solve1(String text) {
            Map<Integer, Pair> map = new LinkedHashMap<>();
            int i = 0;
            for(String str : text.split("\\s+")) {
                map.put(i, new Pair(i, str.length(), str));
                i++;
            }
            PriorityQueue<Map.Entry<Integer, Pair>> pq = new PriorityQueue<>(new MyComparator());
            pq.addAll(map.entrySet());
            StringBuilder sb = new StringBuilder();
            while (!pq.isEmpty()) {
                sb.append(pq.poll().getValue().str);
                sb.append(" ");
            }
            String res = sb.toString();
            res = res.stripTrailing();
            String firstChar = res.substring(0, 1).toUpperCase();
            res = firstChar + res.substring(1).toLowerCase();
            return res;
        }
        static class MyComparator implements Comparator<Map.Entry<Integer, Pair>> {
            @Override
            public int compare(Map.Entry<Integer, Pair> o1, Map.Entry<Integer, Pair> o2) {
                if(o1.getValue().len < o2.getValue().len) {
                    return -1;
                } else if(o1.getValue().len > o2.getValue().len) {
                    return 1;
                }  else {
                    return o1.getValue().pos - o2.getValue().pos;
                }
            }
        }
    }
}
