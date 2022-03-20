package com.zakcorp.leetcodemaster;

import java.util.Stack;

public class Problem_695 {
    static class DFSRecursive {
        public int solve1(int[][] grid) {
            int maxArea = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[i].length; j++) {
                    if(grid[i][j] == 1) {
                        int[] sum = {0};
                        dfs(grid, i, j, sum);
                        maxArea = Math.max(maxArea, sum[0]);
                    }
                }
            }
            return maxArea;
        }
        private void dfs(int[][] grid, int r, int c, int[] sum) {
            if(r < 0 || c < 0 || r >= grid.length || c >= grid[r].length)
                return;

            if(grid[r][c] == 0)
                return;

            sum[0]++;
            grid[r][c] = 0;

            dfs(grid, r + 1, c, sum);
            dfs(grid, r - 1, c, sum);
            dfs(grid, r, c + 1, sum);
            dfs(grid, r, c - 1, sum);
        }
    }
    static class DFSRecursive1 {
        public int maxAreaOfIsland(int[][] grid) {
            int maxArea = 0;
            for(int r = 0; r < grid.length; r++) {
                for(int c = 0; c < grid[0].length; c++) {
                    if(grid[r][c] == 1) {
                        int area = dfs(grid, r, c);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
            return maxArea;
        }
        private int dfs(int[][] grid, int r, int c) {
            if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
                return 0;
            if(grid[r][c] == 0)
                return 0;
            grid[r][c] = 0;
            return dfs(grid, r + 1, c) + dfs(grid, r - 1, c)
                    + dfs(grid, r, c + 1) + dfs(grid, r, c - 1) + 1;
        }
    }
    static class DFSIterative {
        public int maxAreaOfIsland(int[][] grid) {
            int maxArea = 0;
            for(int r = 0; r < grid.length; r++) {
                for(int c = 0; c < grid[0].length; c++) {
                    if(grid[r][c] == 1) {
                        int area = dfs(grid, r, c);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
            return maxArea;
        }
        private int dfs(int[][] grid, int i, int j) {
            int area = 0;
            Stack<int[]> stack = new Stack<>();
            stack.push(new int[]{i, j});
            while( !stack.isEmpty() ) {
                int[] index = stack.pop();
                int r = index[0];
                int c = index[1];
                if(grid[r][c] == 1) {
                    if(r + 1 < grid.length)
                        stack.push(new int[]{r + 1, c});
                    if(r - 1 >= 0)
                        stack.push(new int[]{r - 1, c});
                    if(c + 1 < grid[0].length)
                        stack.push(new int[]{r, c + 1});
                    if(c - 1 >= 0)
                        stack.push(new int[]{r, c - 1});
                    area++;
                    grid[r][c] = 0;
                }
            }
            return area;
        }
    }
}
