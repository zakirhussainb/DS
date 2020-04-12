package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem_1351 {
    static class Solver {
        // Since the matrix is sorted in non-increasing order, i.e. in decreasing order, you can iterate from the end
        // and break when you find a positive element.
        public int countNegatives(int[][] grid) {
            int negatives = 0;
            int rows = grid.length;
            int cols = grid[0].length;
            for(int i = rows - 1; i >= 0; i--) {
                for(int j = cols - 1; j >= 0; j--) {
                    if(grid[i][j] < 0){
                        negatives++;
                    } else {
                        break;
                    }
                }
            }
            return negatives;
        }
    }
}
