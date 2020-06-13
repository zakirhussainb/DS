package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_657 {
    static class Solver {
        /*
        Solve it using simulation method. Remember when you draw a graph in childhood.
                  y
                  |
                  |
                  |
        -x--------0---------x
                  |
                  |
                  |
                  -y
        (x, y) => (0, 0)
         */

        public boolean judgeCircle(String moves) {
            int n = moves.length();
            int x = 0, y = 0;
            for(int i = 0; i < n; i++) {
                if(moves.charAt(i) == 'U') {
                    y++;
                } else if(moves.charAt(i) == 'D') {
                    y--;
                } else if(moves.charAt(i) == 'R') {
                    x++;
                } else if(moves.charAt(i) == 'L') {
                    x--;
                }
            }
            return x == 0 && y == 0;
        }
    }

}
