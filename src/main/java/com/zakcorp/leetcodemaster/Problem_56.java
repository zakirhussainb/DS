package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 08/10/20.
 * Modified by Zakir Hussain B on 19/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_56 {
    // TODO:- 1. Solve this problem by sorting the intervals
    // TODO:- 2. Solve this problem by using Disjoint Set Union
    /*
    252 Meeting Rooms
    253 Meeting Rooms II
    435 Non-overlapping Intervals <- very similar, i did it with just 3 lines different
    Practice them in a row for better understanding
     */
    static class Solver {
        private static class IntervalComparator implements Comparator<int[]> {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        }
        public int[][] solve1(int[][] intervals) {
            Arrays.sort(intervals, new IntervalComparator());
            // Lets assume the intervals are sorted.
            LinkedList<int[]> mergedList = new LinkedList<>();
            for(int[] interval : intervals) {
                if(mergedList.isEmpty() || mergedList.getLast()[1] < interval[0]) {
                    mergedList.add(interval);
                } else {
                    mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], interval[1]);
                }
            }
            return mergedList.toArray(new int[mergedList.size()][]);
        }
        public int[][] solve2(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
            List<int[]> list = new ArrayList<>();
            int[] newInterval = intervals[0];
            list.add(newInterval);
            for(int[] interval : intervals) {
                if(interval[0] <= newInterval[1]) { // Overlapping intervals
                    newInterval[1] = Math.max(newInterval[1], interval[1]);
                } else {
                    newInterval = interval;
                    list.add(newInterval);
                }
            }
            return list.toArray(new int[list.size()][]);
        }
    }
}