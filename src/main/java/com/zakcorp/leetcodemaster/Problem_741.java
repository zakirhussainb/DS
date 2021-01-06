package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_741 {
    static class Solver {
        public int solve1(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            return recursive(0, 0, grid);
        }
        private int recursive(int m, int n, int[][] grid) {
            if(m == grid.length - 1 && n == grid[0].length - 1) {
                return grid[m][n];
            }
            int sum = 0;
            if(m < grid.length && n < grid[0].length) {
                if(grid[m][n] >= 0) {
                    sum += recursive(m, n + 1, grid) + grid[m][n];
                    grid[m][n] = 0;
                    sum += recursive(m + 1, n, grid) + grid[m][n];
                    grid[m][n] = 0;
                }
            }
            return sum;
        }
    }
}
