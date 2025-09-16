package com.zakcorp.striver_series.graphs.traversalproblems;

import java.util.Arrays;

public class FloodFill {
    static class Solver {

        static int[] delRow = {-1, 0, 1, 0};
        static int[] delCol = {0, 1, 0, -1};
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int initialColor = image[sr][sc];
            int m = image.length;
            int n = image[0].length;

            int[][] ans = new int[m][n];
            for(int i = 0; i < m; i++) {
                ans[i] = Arrays.copyOf(image[i], image[i].length);
            }

            dfs(sr, sc, ans, initialColor, newColor, m, n);
            return ans;
        }

        private void dfs(int row, int col, int[][] ans, int initialColor, int newColor, int m, int n) {
            ans[row][col] = newColor;
            for(int i = 0; i < 4; i++) {
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if(isValid(newRow, newCol, m, n)
                    && ans[newRow][newCol] != newColor
                    && ans[newRow][newCol] == initialColor) {
                    dfs(newRow, newCol, ans, initialColor, newColor, m, n);
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
