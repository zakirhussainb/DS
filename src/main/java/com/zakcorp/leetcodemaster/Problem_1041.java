package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1041 {
    static class Solver {
        public boolean solve1(String instructions) {
            // north = 0, east = 1, south = 2, west = 3
            int[][] directions = new int[][]{ {0, 1}, {1, 0}, {0, -1}, {-1, 0} };
            // initial robot start position
            int x = 0, y = 0;
            // facing north
            int index = 0;
            for(char ch : instructions.toCharArray()) {
                if(ch == 'L') {
                    index = (index + 3) % 4;
                } else if(ch == 'R') {
                    index = (index + 1) % 4;
                } else {
                    x += directions[index][0];
                    y += directions[index][1];
                }
            }
            // after one cycle:
            // robot returns into initial position
            // Or doesn't face the north direction
            return (x == 0 && y == 0) || index != 0;
        }
    }
}
