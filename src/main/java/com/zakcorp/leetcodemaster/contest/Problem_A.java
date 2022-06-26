package com.zakcorp.leetcodemaster.contest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_A {
    static class Solver {
        public boolean solve1(int[][] grid) {
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[0].length; j++) {
                    if(i == j) {
                        if(grid[i][j] == 0)
                            return false;
                    } else if( (i + j) == (grid.length - 1) ) {
                        if(grid[i][j] == 0)
                            return false;
                    } else {
                        if(grid[i][j] != 0)
                            return false;
                    }
                }
            }
            return true;
        }
    }
}
