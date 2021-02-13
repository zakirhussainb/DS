package com.zakcorp.final450.matrix;

import java.util.*;

public class P_41 {
    static class Solver {
        /*
        https://practice.geeksforgeeks.org/problems/sorted-matrix2333/1
        */
        public int[][] solve1(int N, int[][] mat) {
            int[] temp = new int[N * N];
            int k = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    temp[k++] = mat[i][j];
                }
            }
            Arrays.sort(temp);
            k = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    mat[i][j] = temp[k++];
                }
            }
            return mat;
        }
    }
}
