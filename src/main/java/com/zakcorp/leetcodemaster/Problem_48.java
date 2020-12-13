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
        public int[][] solve2(int[][] matrix) {
            int n = matrix.length;
            for(int i = 0; i < n; i++) {
                for(int j = i; j < n; j++) {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }
            return matrix;
        }
    }
}
