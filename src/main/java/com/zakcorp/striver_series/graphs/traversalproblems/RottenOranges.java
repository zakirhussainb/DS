package com.zakcorp.striver_series.graphs.traversalproblems;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    static class Solver {
        public int orangesRotting(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;

            Queue<int[]> queue = new LinkedList<>();
            int freshOrangesCount = 0;
            for(int r = 0; r < m; r++) {
                for(int c = 0; c < n; c++) {
                    if(grid[r][c] == 2) {
                        queue.add(new int[]{r, c});
                    } else if(grid[r][c] == 1) {
                        freshOrangesCount++;
                    }
                }
            }

            if(freshOrangesCount == 0) return 0;

            int[] delRow = {-1, 0, 1, 0};
            int[] delCol = {0, 1, 0, -1};

            int totalTimeTaken = 0;
            while(!queue.isEmpty() && freshOrangesCount > 0) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    int[] pair = queue.poll();
                    int row = pair[0];
                    int col = pair[1];

                    for(int j = 0; j < 4; j++) {
                        int newRow = row + delRow[j];
                        int newCol = col + delCol[j];

                        if(isValid(newRow, newCol, m, n)
                                && grid[newRow][newCol] == 1) {

                            queue.add(new int[]{newRow, newCol});
                            grid[newRow][newCol] = 2;
                            freshOrangesCount--;
                        }
                    }
                }
                totalTimeTaken++;
            }

            return freshOrangesCount == 0 ? totalTimeTaken : -1;
        }

        private boolean isValid(int r, int c, int m, int n) {
            if(r < 0 || r >= m) return false;
            if(c < 0 || c >= n) return false;
            return true;
        }
    }
}
