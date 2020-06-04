package com.zakcorp.leetcodemaster;

public class Problem_1450 {
    static class Solver {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            int counter = 0;
            int n = startTime.length;
            for(int i = 0; i < n; i++) {
                if(queryTime >= startTime[i] && queryTime <= endTime[i] ) {
                    counter++;
                }
            }
            return counter;
        }
    }

}
