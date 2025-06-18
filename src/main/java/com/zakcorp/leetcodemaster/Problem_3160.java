package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_3160 {
    static class Solver {
        public int[] solve1(int limit, int[][] queries) {
            Map<Integer, Integer> ballMap = new HashMap<>(); // It represents the Ball-to-Color
            Map<Integer, Integer> colorMap = new HashMap<>(); // It represents the Color-to-NoOfBalls
            int m = queries.length;
            int[] res = new int[m];
            for(int i = 0; i < m; i++) {
                int ball = queries[i][0];
                int color = queries[i][1];

                if(ballMap.containsKey(ball)) {
                    // Decrement count of the previous color on the ball
                    int prevColor = ballMap.get(ball);
                    colorMap.put(prevColor, colorMap.get(prevColor) - 1);
                    colorMap.remove(prevColor, 0); // If there are no balls with previous color left, remove color from color map
                }
                ballMap.put(ball, color);
                // Increment the count of balls for this new color
                colorMap.put(color, colorMap.getOrDefault(color, 0) + 1);
                res[i] = colorMap.size();
            }
            return res;
        }
    }
}
