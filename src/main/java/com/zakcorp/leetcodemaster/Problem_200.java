package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_200 {
    static class Solver {
        public int solve1(int[][] grid) {
            int numOfIslands = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] == 1) {
                        numOfIslands++;
                        dfs(grid, i, j);
                    }
                }
            }
            return numOfIslands;
        }
        private void dfs(int[][] grid, int r, int c) {
            if(r < 0 || c < 0 || r >= grid.length || c >= grid[r].length) {
                return;
            }
            if(grid[r][c] == 0) {
                return;
            }
            grid[r][c] = 0;
            dfs(grid, r + 1, c);
            dfs(grid, r - 1, c);
            dfs(grid, r, c + 1);
            dfs(grid, r, c - 1);
        }
    }
}
