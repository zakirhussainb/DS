package com.zakcorp.striver_series.graphs.traversalproblems;

import java.util.*;

public class NumberOfEnclaves {
    static class Solver {
        public int numberOfEnclaves(int[][] grid) {
            Queue<int[]> queue = new LinkedList<>();
            int m = grid.length;
            int n = grid[0].length;
            boolean[][] visited = new boolean[m][n];
            for(int r = 0; r < m; r++) {
                for(int c = 0; c < n; c++) {
                    if(r == 0 || c == 0 || r == m - 1 || c == n - 1) {
                        if(grid[r][c] == 1) {
                            queue.add(new int[]{r, c});
                            visited[r][c] = true;
                        }
                    }
                }
            }

            int[] delRow = new int[]{-1, 0, 1, 0};
            int[] delCol = new int[]{0, 1, 0, -1};

            while(!queue.isEmpty()) {
                int[] pair = queue.poll();
                int row = pair[0];
                int col = pair[1];

                for(int i = 0; i < 4; i++) {
                    int newRow = row + delRow[i];
                    int newCol = col + delCol[i];

                    if(isValid(newRow, newCol, m, n)
                        && !visited[newRow][newCol]
                        && grid[newRow][newCol] == 1) {
                        queue.add(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }

            int cnt = 0;
            for(int r = 0; r < m; r++) {
                for(int c = 0; c < n; c++) {
                    if(grid[r][c] == 1 && !visited[r][c]) {
                        cnt++;
                    }
                }
            }

            return cnt;
        }

        private boolean isValid(int r, int c, int m, int n) {
            if(r < 0 || r >= m) return false;
            if(c < 0 || c >= n) return false;

            return true;
        }
    }
}
