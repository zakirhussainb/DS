package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_C {
    static class Pair {
        String key;
        int value;
        public Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    static class Solver {
        public int[] solve1(String[] strArr, int[][] queries) {
            int[] res = new int[queries.length];
            String[] temp = Arrays.copyOfRange(strArr, 0, strArr.length);
            int z = 0;
            for(int[] query : queries) {
                int k = query[0];
                int trim = query[1];
                PriorityQueue<Pair> pq = new PriorityQueue<>(new MyComparator());
                for(int i = 0; i < strArr.length; i++) {
                    strArr[i] = strArr[i].substring(strArr[i].length() - trim);
                    String key = strArr[i];
                    pq.add(new Pair(key, i));
                    if(pq.size() > k) {
                        pq.poll();
                    }
                }
                res[z++] = pq.poll().value;
                strArr = temp;
                pq.clear();
            }
            return res;
        }
        static class MyComparator implements Comparator<Pair> {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p2.key.compareTo(p1.key) == 0 ? p2.value - p1.value : p2.key.compareTo(p1.key);
            }
        }
    }
}
