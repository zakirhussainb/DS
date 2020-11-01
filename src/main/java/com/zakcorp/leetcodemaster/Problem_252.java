package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Problem_252 {
    static class Solver {
        public boolean solve1(int[][] intervals) {
            if(intervals.length == 0) {
                return true;
            }
            Arrays.sort(intervals, Comparator.comparingInt(i -> i[1]));
            int f = intervals[0][1];
            for(int i = 1; i < intervals.length; i++) {
                if(intervals[i][0] < f) {
                    return false;
                }
                f = intervals[i][1];
            }
            return true;
        }
    }
}
