package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_973 {
    static class Solver {
        static class Pair {
            double ED;
            int[] points;
            public Pair(double ED, int[] points) {
                this.ED = ED;
                this.points = points;
            }
        }
        public int[][] solve1(int[][] points, int K) {
            int[][] result = new int[K][2];
            int[] origin = {0, 0};
            PriorityQueue<Pair> pq = new PriorityQueue<>(new EuclideanDistanceComparator());
            for(int[] point : points) {
                double ed = Math.sqrt( Math.pow(origin[0] - point[0], 2) + Math.pow(origin[1] - point[1], 2) );
                pq.add(new Pair(ed, point));
            }
            int i = 0;
            while( !pq.isEmpty() ) {
                if(K == 0)
                    break;
                result[i] = pq.poll().points;
                i++;
                K--;
            }
            return result;
        }
        static class EuclideanDistanceComparator implements Comparator<Pair> {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Double.compare(p1.ED, p2.ED);
            }
        }
    }
}
