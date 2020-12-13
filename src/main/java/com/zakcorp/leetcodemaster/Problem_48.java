package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_48 {
    static class Solver {
        public int[][] solve1(int[][] matrix) {
            int n = matrix.length;
            int[][] aux = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    aux[j][i] = matrix[i][j];
                }
            }
            for(int i = 0; i < n; i++) {
                for(int j = n - 1; j >= 0; j--) {
                    matrix[i][n - 1 - j] = aux[i][j];
                }
            }
            return matrix;
        }
    }
}
