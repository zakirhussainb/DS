package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_1380 {
    static class Solver {
        public List<Integer> luckyNumbers (int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[] minR = new int[row];
            Arrays.fill(minR, Integer.MAX_VALUE);
            int[] maxC = new int[col];
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    minR[i] = Math.min(minR[i], matrix[i][j]);
                    maxC[j] = Math.max(maxC[j], matrix[i][j]);
                }
            }
            List<Integer> result = new ArrayList<>();
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    if(minR[i] == maxC[j]) {
                        result.add(minR[i]);
                    }
                }
            }
            return result;
        }
    }

}
