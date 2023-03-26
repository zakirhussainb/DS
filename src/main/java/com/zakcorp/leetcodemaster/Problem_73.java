package com.zakcorp.leetcodemaster;

/**
 * List: Striver Series
 * Article Ref: https://takeuforward.org/data-structure/set-matrix-zero/
 * Vide Ref: https://youtu.be/M65xBewcqcI?list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2
 */
public class Problem_73 {
    /**
     * Brute Force Solution
     * 1. Traverse the matrix, find the position where an element is 0, then
     * 2. Make sure that the element is not zero and mark its entire row and column as INT.MIN_VALUE ->
     * since there can be negative elements in the matrix, you cannot mark it as -1.
     * 3. Finally traverse the matrix again and then mark all the INT_MIN.VAL as 0.
     *
     * TC:
     * Traversing the matrix: O(N * M) and then traversing the inner matrix, O(N + M)
     * so total -> O(N * M) * O(N + M)
     * SC:
     * O(1)
     *
     * NOTE:- This solution will not work for negative values in the matrix, -2 ^ 31 <= matrix[i][j] <= 2 ^ 31 - 1
     */
    static class Solver {
        public int[][] solve1(int[][] matrix) {
            int r = matrix.length;
            int c = matrix[0].length;
            boolean isAltered = false;
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(matrix[i][j] == 0) {
                        markThem(matrix, i, j);
                        isAltered = true;
                    }
                }
            }
            if(!isAltered)
                return matrix;
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(matrix[i][j] == (int)Long.MAX_VALUE) {
                        matrix[i][j] = 0;
                    }
                }
            }
            return matrix;
        }
        private void markThem(int[][] matrix, int row, int col) {
            for(int c = 0; c < matrix[0].length; c++) {
                if(matrix[row][c] != 0)
                    matrix[row][c] = (int)Long.MAX_VALUE;
            }
            for(int r = 0; r < matrix.length; r++) {
                if(matrix[r][col] != 0)
                    matrix[r][col] = (int)Long.MAX_VALUE;
            }
        }
    }

    /**
     * Better Solution
     * 1. Create two temporary arrays, one to store the row information and other to store col info.
     * 2. Traverse the matrix, if a cell is zero then mark the row and col of the temp arrays as -1.
     * 3. Now traverse the matrix again, now if the tempRow is -1 and tempCol is -1, then mark the matrix cell as 0,
     * given that it is already not zero.
     *
     * TC:
     * Traversing the matrix: O(N * M) and
     * then traversing the matrix again, O(N * M)
     * so total -> O(N * M) + O(N * M)
     * SC:
     * O(N) + O(M) -> for creating two separate arrays to maintain the row and col info
     *
     * */
    static class Solver1 {
        public int[][] solve1(int[][] matrix) {
            int r = matrix.length;
            int c = matrix[0].length;
            int[] tempRow = new int[r];
            int[] tempCol = new int[c];
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(matrix[i][j] == 0) {
                        tempRow[i] = -1;
                        tempCol[j] = -1;
                    }
                }
            }
            for(int i = 0; i < r; i++) {
                for ( int j = 0; j < c; j++ ) {
                    if(matrix[i][j] != 0 && (tempRow[i] == -1 || tempCol[j] == -1) )
                        matrix[i][j] = 0;
                }
            }
            return matrix;
        }
    }
}
