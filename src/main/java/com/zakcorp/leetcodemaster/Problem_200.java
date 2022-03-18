package com.zakcorp.leetcodemaster;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_200 {
    static class DFSRecursive {
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
    static class BFS {
        public int solve1(int[][] grid) {
            int numOfIslands = 0;
            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == 1) {
                        numOfIslands++;
                        bfs(grid, i, j);
                    }
                }
            }
            return numOfIslands;
        }
        private void bfs(int[][] grid, int i, int j) {
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{i, j});
            while( !queue.isEmpty() ) {
                int[] index = queue.poll();
                int x = index[0];
                int y = index[1];
                if(x - 1 >= 0)
                    queue.add(new int[]{x - 1, j});
                if(y - 1 >= 0)
                    queue.add(new int[]{x, y - 1});
                if(x + 1 < grid.length)
                    queue.add(new int[]{x + 1, y});
                if(y + 1 < grid[0].length)
                    queue.add(new int[]{x, y + 1});
                grid[x][y] = 0;
            }
        }
    }
}
