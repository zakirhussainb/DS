package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_378 {
    static class Solver {
        public int solve1(int[][] mat, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);
            for (int[] rows : mat) {
                for (int row : rows) {
                    pq.add(row);
                }
            }
            int l = 1;
            while( !pq.isEmpty() ) {
                if(l == k) {
                    return pq.poll();
                }
                pq.poll();
                l++;
            }
            return -1;
        }
        public int solve2(int[][] mat, int k) {

        }
    }
}
