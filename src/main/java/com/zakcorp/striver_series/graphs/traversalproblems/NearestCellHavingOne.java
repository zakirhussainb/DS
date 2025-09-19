package com.zakcorp.striver_series.graphs.traversalproblems;

import java.util.LinkedList;
import java.util.Queue;

public class NearestCellHavingOne {
    static class Solver {
        public int[][] nearest(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            boolean[][] visited = new boolean[m][n];
            int[][] distanceMatrix = new int[m][n];

            Queue<int[]> queue = new LinkedList<>();
            for(int r = 0; r < m; r++) {
                for(int c = 0; c < n; c++) {
                    if(grid[r][c] == 1) {
                        visited[r][c] = true;
                        queue.add(new int[]{r, c, 0});
                    }
                }
            }

            int[] delRow = {-1, 0, 1, 0};
            int[] delCol = {0, 1, 0, -1};
            while(!queue.isEmpty()) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    int[] pair = queue.poll();
                    int row = pair[0];
                    int col = pair[1];
                    int steps = pair[2];

                    for(int j = 0; j < 4; j++) {
                        int newRow = row + delRow[j];
                        int newCol = col + delCol[j];

                        if(isValid(newRow, newCol, m, n)
                            && grid[newRow][newCol] == 0
                            && !visited[newRow][newCol]) {

                            queue.add(new int[]{newRow, newCol, steps + 1});
                            visited[newRow][newCol] = true;
                            distanceMatrix[newRow][newCol] = 1;
                        }
                    }
                }
            }
            return distanceMatrix;
        }

        private boolean isValid(int r, int c, int m, int n) {
            if(r < 0 || r >= m) return false;
            if(c < 0 || c >= n) return false;
            return true;
        }
    }
}
