package com.zakcorp.striver_series.graphs.shortestpathalgos;

import java.util.*;

public class PathWithMinimumEffort {
    static class Solver {
        public int minimumEffort(List<List<Integer>> heights) {
            int m = heights.size();
            int n = heights.get(0).size();
            // Create differences matrix
            int[][] differences = new int[m][n];
            for(int r = 0; r < m; r++) {
                Arrays.fill(differences[r], (int)1e9);
            }
            differences[0][0] = 0;

            // Min Heap - to store the difference, coordinates
            PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
            pq.add(new int[]{0, 0, 0}); // dist, {0,0}

            int[] delRow = new int[]{-1, 0, 1, 0};
            int[] delCol = new int[]{0, 1, 0, -1};

            while(!pq.isEmpty()) {
                int[] cell = pq.poll();

                int currDiff = cell[0];
                int row = cell[1];
                int col = cell[2];

                if(row == m - 1 && col == n - 1) {
                    return currDiff;
                }

                for(int i = 0; i < 4; i++) {
                    int newRow = row + delRow[i];
                    int newCol = col + delCol[i];

                    if(isValidIndex(newRow, newCol, m, n)) {
                        int absDiff = Math.abs( heights.get(row).get(col) - heights.get(newRow).get(newCol) );
                        if(currDiff + absDiff < differences[newRow][newCol]) {
                            differences[newRow][newCol] = currDiff + absDiff;
                            pq.add(new int[]{differences[newRow][newCol], newRow, newCol});
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
