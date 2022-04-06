package com.zakcorp.leetcodemaster;

public class Problem_73 {
    static class Solver {
        public int[][] solve1(int[][] matrix) {
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[0].length; j++) {
                    if(matrix[i][j] == 0) {
                        fillZeros(matrix, i, j);
                    }
                }
            }
            return matrix;
        }
        private void fillZeros(int[][] matrix, int row, int col) {
            for(int j = 0; j < matrix[0].length; j++) {
               matrix[row][j] = 0;
            }
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
