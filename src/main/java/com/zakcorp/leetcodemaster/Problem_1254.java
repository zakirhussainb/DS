package com.zakcorp.leetcodemaster;

public class Problem_1254 {
    /*
    Land is represented as '0' and water is represented as '1' and closed island is represented as a land('0') 4-directionally
    surrounded by water('1')
     */
    static class Solver {
        public int solve1(int[][] grid) {
            int numOfClosedIslands = 0;
            for(int r = 0; r < grid.length; r++) {
                for(int c = 0; c < grid[0].length; c++) {
                    if(grid[r][c] == 0) {
                        if( dfs(grid, r, c) ) {
                            numOfClosedIslands++;
                        }
                    }
                }
            }
            return numOfClosedIslands;
        }
        private boolean dfs(int[][] grid, int r, int c) {
            if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
                return false;
            if(grid[r][c] == 1)
                return true;
            grid[r][c] = 1;
            boolean top = dfs(grid, r + 1, c);
            boolean bottom = dfs(grid, r - 1, c);
            boolean right = dfs(grid, r, c + 1);
            boolean left = dfs(grid, r, c - 1);
            return top && bottom && right && left;
        }
    }
}
