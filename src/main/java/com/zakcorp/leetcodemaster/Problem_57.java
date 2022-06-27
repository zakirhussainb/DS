package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_57 {
    /* Brute Force Solution
        1. Create an arrayList of int[], since the intervals are sorted, just insert the new interval in the existing
        intervals in a sorted way.
        2. Insert the newly created intervals into the implementation for mergeIntervals();
     */
    static class Solver {
        public int[][] solve1(int[][] intervals, int[] newInterval) {
            if(intervals.length == 0 && newInterval.length != 0) {
                int[][] ans = new int[1][2];
                ans[0][0] = newInterval[0];
                ans[0][1] = newInterval[1];
                return ans;
            }
            ArrayList<int[]> al = new ArrayList<>();
            boolean isInserted = false;
            for(int[] interval : intervals) {
                if(!isInserted && newInterval[0] < interval[0]) {
                    al.add(newInterval);
                    isInserted = true;
                }
                al.add(interval);
            }
            if(!isInserted) {
                al.add(newInterval);
            }
            return mergeIntervals(al.toArray(new int[al.size()][]));
        }
        private int[][] mergeIntervals(int[][] intervals) {
            LinkedList<int[]> ll = new LinkedList<>();
            for(int[] interval : intervals) {
                if(ll.isEmpty() || ll.getLast()[1] < interval[0]) {
                    ll.add(interval);
                } else {
                    ll.getLast()[1] = Math.max(ll.getLast()[1], interval[1]);
                }
            }
            return ll.toArray(new int[ll.size()][]);
        }
    }
    /*
        1. Create a LinkedList of intervals.
        2. Add to the ll all the interval starting before newInterval.
     */
    static class Solver1 {
        public int[][] solve1(int[][] intervals, int[] newInterval) {
            LinkedList<int[]> ll = new LinkedList<>();
            int idx = 0, n = intervals.length;
            // Add all the intervals starting before the newInterval to an output list
            while(idx < n && intervals[idx][0] < newInterval[0])
                ll.add(intervals[idx++]);

            // If the list is empty add the newInterval -> as this is the starting interval
            // Then merge the last list with newInterval
            if(ll.isEmpty() || ll.getLast()[1] < newInterval[0]) {
                ll.add(newInterval);
            } else {
                ll.getLast()[1] = Math.max(ll.getLast()[1], newInterval[1]);
            }
            // Merge the rest of the intervals with the output list
            while(idx < n) {
                if(ll.getLast()[1] < intervals[idx][0]) {
                    ll.add(intervals[idx]);
                } else {
                    ll.getLast()[1] = Math.max(ll.getLast()[1], intervals[idx][1]);
                }
                idx++;
            }
            return ll.toArray(new int[ll.size()][]);
        }
    }
}
