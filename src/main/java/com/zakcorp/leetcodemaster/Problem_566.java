package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_566 {
    static class Solver {
        /*
            Things to remember here:-
            Approach 1:- Use Queue
            Approach 2:-
            Solve this problem in only one traversal
            Introduce two new variables for row and cols to be stored in the resultant array  and manipulate accordingly.
         */
        public int[][] solve1(int[][] arr, int r, int c) {
            int row = arr.length;
            int col = arr[0].length;
            if(row * col != r * c) {
                return arr;
            }
            int rMag = 0, cMag = 0;
            int[][] result = new int[r][c];
            for (int[] ints : arr) {
                for (int j = 0; j < col; j++) {
                    result[rMag][cMag] = ints[j];
                    cMag++;
                    if (cMag == c) {
                        cMag = 0;
                        rMag++;
                    }
                }
            }
            return result;
        }
        public int[][] solve2(int[][] arr, int r, int c) {
            int row = arr.length;
            int col = arr[0].length;
            if(row * col != r * c) {
                return arr;
            }
            Queue<Integer> queue = new LinkedList<>();
            for (int[] ints : arr) {
                for (int j = 0; j < col; j++) {
                    queue.add(ints[j]);
                }
            }
            int[][] result = new int[r][c];
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    result[i][j] = queue.remove();
                }
            }
            return result;
        }
    }
}
