package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 08/10/20.
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
        public int[][] solve1(int[][] intervals) {
            int[] scale = new int[20];
            int i = 0;
            int number = 0;
            for(int[] interval : intervals) {
                int start = interval[0], end = interval[1];
                number = i + 1;
                for(int k = start; k <= end; k++) {
                    if(scale[k] == 0) {
                        if(scale[k - 1] != 0) {

                        } else {

                        }
                    } else if(scale[k] != 0 && scale[k] == number - 1) {
                        scale[k] = number - 1;
                    }
                }
                i++;
            }
            return null;
        }
    }
}