package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class ShortestDistInBinaryMaze {
    static class Solver {
        public int shortestPath(int[][] grid, int[] source, int[] destination) {
            if (source[0] == destination[0] && source[1] == destination[1])
                return 0;
            int m = grid.length;
            int n = grid[0].length;
            // Create distance matrix
            int[][] distances = new int[m][n];
            for(int r = 0; r < m; r++) {
                Arrays.fill(distances[r], (int)1e9);
            }
            distances[source[0]][source[1]] = 0;

            Queue<int[]> queue = new LinkedList<>(); // dist, src[0], src[1]
            queue.add(new int[]{0, source[0], source[1]});

            int[] delRow = new int[]{-1, 0, 1, 0};
            int[] delCol = new int[]{0, 1, 0, -1};

            while(!queue.isEmpty()) {
                int[] cell = queue.poll();

                int dist = cell[0];
                int x = cell[1];
                int y = cell[2];

                for(int i = 0; i < 4; i++) {
                    int newRow = x + delRow[i];
                    int newCol = y + delCol[i];
                    if(isValidIndex(newRow, newCol, m, n)) {
                        if(grid[newRow][newCol] == 1 && dist + 1 < distances[newRow][newCol]) {
                            distances[newRow][newCol] = dist + 1;
                            if(newRow == destination[0] && newCol == destination[1]) { // we have reached our destination
                                return distances[newRow][newCol];
                            }
                            queue.add(new int[]{distances[newRow][newCol], newRow, newCol});
                        }
                    }
                }
            }
            return -1;
        }

        private boolean isValidIndex(int r, int c, int m, int n) {
            if(r < 0 || r >= m) return false;
            if(c < 0 || c >= n) return false;
            return true;
        }
    }
}
