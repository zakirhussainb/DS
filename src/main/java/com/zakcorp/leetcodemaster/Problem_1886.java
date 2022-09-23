package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1886 {
    static class Solver {
        public boolean solve1(int[][] mat, int[][] target) {
            for(int i = 0; i < 4; i++) {
                takeTranspose(mat);
                reverseRows(mat);
                if(checkIfEqual(mat, target)) {
                    return true;
                }
            }
            return false;
        }
        private void takeTranspose(int[][] mat) {
            for(int r = 0; r < mat.length; r++) {
                for(int c = r + 1; c < mat[0].length; c++) {
                    int temp = mat[c][r];
                    mat[c][r] = mat[r][c];
                    mat[r][c] = temp;
                }
            }
        }
        private void reverseRows(int[][] mat) {
            for(int x = 0; x < mat.length; x++) {
                int low = 0, high = mat[0].length - 1;
                while(low < high) {
                    int temp = mat[x][low];
                    mat[x][low] = mat[x][high];
                    mat[x][high] = temp;
                    low++;
                    high--;
                }
            }
        }
        private boolean checkIfEqual(int[][] mat, int[][] target) {
            for(int x = 0; x < mat.length; x++) {
                for(int y = 0; y < mat[0].length; y++) {
                    if(mat[x][y] != target[x][y]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
