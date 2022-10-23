package com.zakcorp.leetcodemaster.contest;

public class Problem_A {
    static class Solver {
        public boolean solve1(String[] event1, String[] event2) {
            // Convert time to minutes
            int startTime1 = getMinutes(event1[0]);
            int endTime1 = getMinutes(event1[1]);

            int startTime2 = getMinutes(event2[0]);
            int endTime2 = getMinutes(event2[1]);

            return endTime1 >= startTime2 && startTime1 <= endTime2;
        }
        private int getMinutes(final String s) {
            int hh = Integer.parseInt(s.substring(0, 2)); // 21
            int mm = Integer.parseInt(s.substring(3)); // 30
            return 60 * hh + mm;
        }
    }
}
