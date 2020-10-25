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
public class Problem_74 {
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
            int row = matrix.length;
            int col = matrix[0].length;
            int low = 0, high = row * col - 1;
            while(low <= high){
                int mid = (low + high) / 2;
                int midVal = matrix[mid/col][mid%col];
                if(midVal < target) {
                    low = mid + 1;
                } else if(midVal > target) {
                    high = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}