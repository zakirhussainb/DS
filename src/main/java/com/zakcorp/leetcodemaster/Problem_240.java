package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 25/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_240 {
    static class Solver {
        public boolean solve1(int[][] matrix, int target) {
            int col = matrix[0].length;
            for (int[] rows : matrix) {
                for (int j = 0; j < col; j++) {
                    if (rows[j] == target) {
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean solve2(int[][] matrix, int target) {
            int i = 0, j = matrix[0].length - 1;
            while(j >= 0 && i <= matrix.length - 1) {
                if(target < matrix[i][j]) {
                    j--;
                } else if(target > matrix[i][j]) {
                    i++;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}