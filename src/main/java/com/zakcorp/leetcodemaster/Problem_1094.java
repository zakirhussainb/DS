package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1094 {
    static class Solver {
        public boolean solve1(int[][] trips, int capacity) {
//            PriorityQueue<int[]> pq = new PriorityQueue<>(new MyComparator());
//            Collections.addAll(pq, trips);
//            int sP = 0, eP = 0, prevTripPassCount = 0;
//            while (!pq.isEmpty()) {
//                int[] trip = pq.poll();
//                if (sP == 0 && eP == 0) {
//                    sP = trip[1];
//                    eP = trip[2];
//                    prevTripPassCount = trip[0];
//                } else {
//                    if (eP > trip[1]) {
//                        if (capacity >= currTripPassCount) {
//                            capacity -= currTripPassCount;
//                        } else {
//                            return false;
//                        }
//                    }
//                    if (eP < trip[2]) {
//                        capacity += currTripPassCount;
//                    }
//                    sP = trip[1];
//                    eP = trip[2];
//                }
//                if (capacity >= prevTripPassCount) {
//                    capacity -= prevTripPassCount;
//                } else {
//                    return false;
//                }
//                prevTripPassCount = trip[0];
//            }
            return false;
        }
    }
//    static class MyComparator implements Comparator<int[]> {
//        @Override
//        public int compare(int[] o1, int[] o2) {
//            return o1[1] - o2[1];
//        }
//    }
}
