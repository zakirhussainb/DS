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
        public int[][] solve3(int[][] matrix) {
            int n = matrix.length;
            for(int i = 0; i < (n + 1) / 2; i++) {
                for(int j = 0; j < n / 2; j++) {
                    int temp = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
            return matrix;
        }
        public int[][] solve4(int[][] matrix) {
            // Take transpose of the matrix
            for(int i = 0; i < matrix.length; i++) {
                for(int j = i; j < matrix[0].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            // Reverse the elements in each row using two pointers
            for(int i = 0; i < matrix.length; i++) {
                int low = 0, high = matrix[0].length - 1;
                while(low < high) {
                    int temp = matrix[i][low];
                    matrix[i][low] = matrix[i][high];
                    matrix[i][high] = temp;
                    low++;
                    high--;
                }
            }
            return matrix;
        }
    }
}
