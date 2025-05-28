package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_253 {
    static class Solver {
        public int solve1(int[][] intervals) {
            int m = intervals.length;
            for(int r=0;r<m;r++){
                for(int c = 0; c < intervals[r].length; c++) {
                    System.out.print(intervals[r][c] + " ");
                }
                System.out.println();
            }
            System.exit(0);
            if(intervals.length == 0) {
                return 0;
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);
            // Sort all the meetings by there start time
            Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
            pq.add(intervals[0][1]);
            for(int i = 1; i < intervals.length; i++) {
                if( !pq.isEmpty() && intervals[i][0] >= pq.peek() ) {
                    pq.poll();
                }
                pq.add(intervals[i][1]);
            }
            return pq.size();
        }
        public int solve2(int[][] intervals) {
            // Creating two arrays, for maintaining start and end times separately
            int n = intervals.length;
            if(n == 0)
                return 0;
            int[] start = new int[n];
            int[] end = new int[n];
            for(int i = 0; i < n; i++) {
                start[i] = intervals[i][0];
                end[i] = intervals[i][1];
            }
            // Sort both the arrays
            Arrays.sort(start);
            Arrays.sort(end);
            int s = 0, e = 0;
            int rooms = 0;
            // When we encounter an ending event, that means that some meeting that started earlier has ended now.
            // We are not really concerned with which meeting has ended. All we need is that some meeting ended thus
            // making a room available.
            while(s < start.length && e < end.length) {
                if(start[s] >= end[e]) {
                    e++;
                } else {
                    rooms++;
                }
                s++;
            }
            return rooms;
        }
    }
}
