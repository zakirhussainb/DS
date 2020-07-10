package com.zakcorp.leetcodemaster;

import java.util.Arrays;

public class Problem_1266 {
    /**
     * This problem is based on the formula to "Find the distance between two points"
     * https://www.youtube.com/watch?v=0IOEPcAHgi4
     * d = square_root_of( (x2 - x1)^2 + (y2 - y1)^2 )
     *     Or
     * dx = |x1 - x2| and dy = |y1 - y2|
     *
     * @param points two dimensional array representing points in a plane.
     * @return minimum time in seconds taken to visit all the points.
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;
        for(int i = 0; i < points.length - 1; i++) {
            minTime += findDistance(points[i], points[i + 1]);
        }
        return minTime;
    }
    private int findDistance(int[] p1, int[] p2) {
        int x = Math.abs(p1[0] - p2[0]);
        int y = Math.abs(p1[1] - p2[1]);
        return Math.max(x, y);
    }
}
