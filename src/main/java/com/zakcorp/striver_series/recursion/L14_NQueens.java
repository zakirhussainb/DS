package com.zakcorp.striver_series.recursion;

import java.util.*;

public class L14_NQueens
{
    // Refer problems 51 and 52 from Leetcode
    // There are two solutions
    // https://youtu.be/i05Ju7AftcM?list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9
    static class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> result = new ArrayList<>();
            String[][] matrix = new String[n][n];
            for(int r = 0; r < n; r++) {
                for(int c = 0; c < n; c++) {
                    matrix[r][c] = "-";
                }
            }

            List<String> list = new ArrayList<>();
            for(int r = 0; r < n; r++) {
                for(int c = 0; c < n; c++) {
                    markQueenPositions(matrix, n, r, c);
                }
            }

            return result;
        }

        private void markQueenPositions(String[][] matrix, int n, int row, int col) {
            if(row >= n || col >= n) {
                return;
            }

            matrix[row][col] = "Q";
            for(int r = 0; r < n; r++) {
                for(int c = 0; c < n; c++) {
                    if(!matrix[r][c].equals("Q") && !matrix[r][c].equals(".")) {
                        // Handle for rows
                        if(r == row) {
                            matrix[r][c] = ".";
                        }

                        // Handle for columns
                        if(c == col) {
                            matrix[r][c] = ".";
                        }
                        // Handle for diagonals
                        if(r == c) {
                            matrix[r][c] = ".";
                        }
                    }
                }
            }
            markQueenPositions(matrix, n, row + 1, col);
        }
    }
}
