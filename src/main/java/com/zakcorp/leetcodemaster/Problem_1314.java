package com.zakcorp.leetcodemaster;

public class Problem_1314
{
    static class Solver {
        public int[][] solve1(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            // Generate prefix sum for the given matrix.
            // Step 1 -> Make a prefix-matrix, where each row has prefix sum independent of any other row.
            int[][] prefixMat = new int[m][n];
            for(int r = 0; r < m; r++) {
                prefixMat[r][0] = mat[r][0];
                for(int c = 1; c < n; c++) {
                    prefixMat[r][c] = prefixMat[r][c - 1] + mat[r][c];
                }
            }

            // Step 2 -> Turn the prefix-matrix from Step 1 to another prefix-matrix but now column wise.
            for(int c = 0; c < n; c++) {
                prefixMat[0][c] = prefixMat[0][c];
                for(int r = 1; r < m; r++) {
                    prefixMat[r][c] = prefixMat[r - 1][c] + prefixMat[r][c];
                }
            }
            // Calculate
            for(int r = 0; r < m; r++) {
                int ru = Math.max(r - k, 0);
                int rd = Math.min(r + k, m - 1);
                for(int c = 0; c < n; c++) {
                    int cl = Math.max(0, c - k);
                    int cr = Math.min(n - 1, c + k);
                    int value = prefixMat[rd][cr];
                    if(ru - 1 >= 0)
                        value -= prefixMat[ru - 1][cr];
                    if(cl - 1 >= 0)
                        value -= prefixMat[rd][cl - 1];
                    if(ru - 1 >= 0 && cl - 1 >= 0)
                        value += prefixMat[ru - 1][cl - 1];
                    mat[r][c] = value;
                }
            }
            return mat;
        }
    }
}
