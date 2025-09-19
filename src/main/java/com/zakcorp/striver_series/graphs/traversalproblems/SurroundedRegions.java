package com.zakcorp.striver_series.graphs.traversalproblems;

public class SurroundedRegions {
    static class Solver {
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        public char[][] fill(char[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            boolean[][] visited = new boolean[m][n];

            // Solve for rows - Perform DFS on all the 'O's that are present in the boundary rows.
            for(int c = 0; c < n; c++) {
                // First Row
                if(mat[0][c] == 'O' && !visited[0][c]) {
                    dfs(0, c, visited, mat, m, n);
                }

                // Last Row
                if(mat[m - 1][c] == 'O' && !visited[m - 1][c]) {
                    dfs(m - 1, c, visited, mat, m, n);
                }
            }

            // Solve for columns - Perform DFS on all the 'O's that are present in the boundary columns.
            for(int r = 0; r < m; r++) {
                // First Column
                if(mat[r][0] == 'O' && !visited[r][0]) {
                    dfs(r, 0, visited, mat, m, n);
                }

                // Last Column
                if(mat[r][n - 1] == 'O' && !visited[r][n - 1]) {
                    dfs(r, n - 1, visited, mat, m, n);
                }
            }

            for(int r = 0; r < m; r++) {
                for(int c = 0; c < n; c++) {
                    if(mat[r][c] == 'O' && !visited[r][c]) {
                        mat[r][c] = 'X';
                    }
                }
            }

            return mat;
        }

        private void dfs(int row, int col, boolean[][] visited, char[][] mat, int m, int n) {
            visited[row][col] = true;

            for(int i = 0; i < 4; i++) {
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];

                if(isValid(newRow, newCol, m, n)
                    && mat[newRow][newCol] == 'O'
                    && !visited[newRow][newCol]) {
                    dfs(newRow, newCol, visited, mat, m, n);
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
