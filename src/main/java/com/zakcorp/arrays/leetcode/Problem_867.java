package com.zakcorp.arrays.leetcode;

public class Problem_867 {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {4,5}, {7,8}};
        int[][] result = transpose(arr);
        int n = result.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] arr) {
        int rowLen = arr.length;
        int colLen = arr[0].length;
        int[][] result = new int[colLen][rowLen];
        for(int r = 0; r < rowLen; r++){
            for(int c = r + 1; c < colLen; c++){
                arr[c][r] = arr[r][c];
            }
        }
        return result;
    }
}
