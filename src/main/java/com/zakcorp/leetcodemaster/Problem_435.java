package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_435 {
    static class Solver {
        public int solve1(int[][] intervals) {
            int rows = intervals.length;
            if(rows == 0) {
                return 0;
            }
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
            int counter = 0;
            int endPoint = intervals[0][1];
            for(int i = 1; i < rows; i++) {
                if( intervals[i][0] < endPoint) {
                    counter++;
                } else {
                    endPoint = intervals[i][1];
                }
            }
            return counter;
        }

        public int solve2(int[][] intervals) {
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x[1]));
            pq.addAll(Arrays.asList(intervals));
            int ans = 0;
            int end = Integer.MIN_VALUE;
            while(!pq.isEmpty()) {
                int[] interval = pq.poll();
                if(end <= interval[0]) {
                    end = interval[1];
                } else {
                    ans++;
                }
            }
            return ans;
        }
    }
}
