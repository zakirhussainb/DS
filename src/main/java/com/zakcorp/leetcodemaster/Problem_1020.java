package com.zakcorp.leetcodemaster;

public class Problem_1020 {
    static class Solver {
        public int solve1(int[][] grid) {
            for(int r = 0; r < grid.length; r++) {
                for(int c = 0; c < grid[0].length; c++) {
                    if(r == 0 || c == 0 || r == grid.length - 1 || c == grid[0].length - 1)
                        dfs(grid, r, c);
                }
            }

            int numOfValidLandMoves = 0;
            for(int r = 0; r < grid.length; r++) {
                for(int c = 0; c < grid[0].length; c++) {
                    if(grid[r][c] == 1) {
                        numOfValidLandMoves += dfs(grid, r, c);
                    }
                }
            }
            return numOfValidLandMoves;
        }
        private int dfs(int[][] grid, int r, int c) {
            if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0)
                return 0 ;

            grid[r][c] = 0;

            return dfs(grid, r + 1, c) + dfs(grid, r - 1, c) +
            dfs(grid, r, c + 1) + dfs(grid, r, c - 1) + 1;
        }
    }
}
