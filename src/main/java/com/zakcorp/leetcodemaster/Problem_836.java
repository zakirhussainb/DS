package com.zakcorp.leetcodemaster;

public class Problem_836 {
    static class Solver {
        public boolean solve1(int[] rect1, int[] rect2) {
            // Rect1 -> [x1, y1, x2, y2] and Rect2 -> [p1, q1, p2, q2]
            int x1 = rect1[0], p1 = rect2[0];
            int y1 = rect1[1], q1 = rect2[1];
            int x2 = rect1[2], p2 = rect2[2];
            int y2 = rect1[3], q2 = rect2[3];

            return q1 < y2 && y1 < q2 && p1 < x2 && x1 < p2;
        }
    }
}
