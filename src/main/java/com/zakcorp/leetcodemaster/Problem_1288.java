package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1288
{
    static class Solver {
        /*
        1. Sort by the left bound, and when left bounds are equal, sort right bounds by reverse order;
        Therefore, no interval can cover previous ones;
        2. Loop through the intervals, whenever current right most bound < next interval's right bound, it means current
         interval can NOT cover next interval, update right most bound and increase counter by 1.
         */
        public int solve1(int[][] intervals) {
            Arrays.sort(intervals, (i1, i2) -> i1[0] == i2[0] ? i2[1] - i1[1] : i1[0] - i2[0]);
            int remainingIntervals = 0, curr = 0;
            for(int[] interval : intervals) {
                if(curr < interval[1]) {
                    curr = interval[1];
                    remainingIntervals++;
                }
            }
            return remainingIntervals;
        }
    }
}
