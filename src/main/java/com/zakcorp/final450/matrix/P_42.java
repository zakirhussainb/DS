package com.zakcorp.final450.matrix;

import java.util.*;

public class P_42 {

    static class Solver {
        public int solve1(int[][] matrix) {
            int maxArea = 0;
            int area = 0;
            int[] temp = new int[matrix[0].length];
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    if(matrix[i][j] == 0) {
                        temp[j] = 0;
                    } else {
                        temp[j] += matrix[i][j];
                    }
                }
                area = maxHistogram(temp);
                maxArea = Math.max(maxArea, area);
            }
            return maxArea;
        }
        private int maxHistogram(int[] input) {
            Deque<Integer> stack = new LinkedList<>();
            int area = 0, maxArea = 0;
            for(int i = 0; i < input.length; i++) {
                
            }
            return -1;
        }
    }
}
