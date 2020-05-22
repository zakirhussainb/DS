package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.List;

public class Problem_766 {
    static class Solver {
        public boolean isToeplitzMatrix(int[][] matrix) {
            int m = matrix.length;
            for(int i = 0; i < matrix.length; i++){
                for(int j = i; j < matrix.length; j++){
                    System.out.print(matrix[i][j] +" ");
                }
                System.out.println();
            }
            return false;
        }
    }
}
