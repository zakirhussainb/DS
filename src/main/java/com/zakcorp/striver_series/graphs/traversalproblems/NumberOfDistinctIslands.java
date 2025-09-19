package com.zakcorp.striver_series.graphs.traversalproblems;

import java.util.*;

public class NumberOfDistinctIslands {
    static class Solver {

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        public int countDistinctIslands(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            boolean[][] visited = new boolean[m][n];
            Set<List<String>> set = new HashSet<>();
            for(int r = 0; r < m; r++) {
                for(int c = 0; c < n; c++) {
                    if(grid[r][c] == 1 && !visited[r][c]) {
                        List<String> path = new ArrayList<>();
                        dfs(r, c, path, visited, grid, r, c);
                        set.add(path);
                    }
                }
            }

            return set.size();
        }

        private void dfs(int row, int col, List<String> path, boolean[][] visited, int[][] grid, int baseRow, int baseCol) {
            visited[row][col] = true;
            int m = grid.length;
            int n = grid[0].length;

            path.add((row - baseRow) + "," + (col - baseCol));

            for(int i = 0; i < 4; i++) {
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if(isValid(newRow, newCol, m, n)
                    && grid[newRow][newCol] == 1
                    && !visited[newRow][newCol]) {
                    dfs(newRow, newCol, path, visited, grid, baseRow, baseCol);
                }
            }
        }
        private boolean isValid(int r, int c, int m, int n) {
            if(r < 0 || r >= m) return false;
            if(c < 0 || c >= n) return false;
            return true;
        }
    }
}
