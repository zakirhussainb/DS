package com.zakcorp.final450.matrix;

import java.util.Arrays;

public class P_45 {
    static class Solver {
        /*
        https://practice.geeksforgeeks.org/problems/kth-element-in-matrix/1
        */
        public int solve1(int[][] mat, int n, int k) {
            int[] temp = new int[n * n];
            int m = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    temp[m++] = mat[i][j];
                }
            }
            Arrays.sort(temp);
            return temp[k - 1];
        }
    }
}
