package com.zakcorp.striver_series.dp;

public class CherryPickUpII {
    public int cherryPickup(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        return recur(m - 1, n - 1, m - 1, 0, matrix);
    }
    private int recur(int r1, int c1, int r2, int c2, int[][] matrix) {

        if(r1 < 0 || c1 < 0 || c1 >= matrix[0].length
        || r2 < 0 || c2 < 0 || c2 >= matrix[0].length) {
            return 0;
        }

        if(r1 == 0) {
            return matrix[r1][c1];
        }

        if(r2 == 0) {
            return matrix[r2][c2];
        }

        if(r1 == r2 && c1 == c2) {
            int top = recur(r1 - 1, c1, matrix);
            int topLeft = recur(r1 - 1, c1 - 1, matrix);
            int topRight = recur(r1 - 1, c1 + 1, matrix);
        }

        if(matrix[r][c] == -1) {
            return 0;
        }

        int temp = matrix[r][c];
        matrix[r][c] = -1;

        int top = recur(r - 1, c, matrix);
        int topLeft = recur(r - 1, c - 1, matrix);
        int topRight = recur(r - 1, c + 1, matrix);

        return Math.max(top, Math.max(topLeft, topRight)) + temp;
    }
}
